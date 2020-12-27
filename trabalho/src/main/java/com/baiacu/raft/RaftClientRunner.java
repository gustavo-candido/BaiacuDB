package com.baiacu.raft;

import com.proto.baiacu.*;

import java.util.*;

import org.apache.ratis.client.RaftClient;
import org.apache.ratis.conf.Parameters;
import org.apache.ratis.conf.RaftProperties;
import org.apache.ratis.grpc.GrpcFactory;
import org.apache.ratis.protocol.*;
import org.apache.ratis.thirdparty.com.google.protobuf.ByteString;
import utils.PropertiesReader;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.stream.Collectors;

public class RaftClientRunner {

    private RaftClient client;


    public StoreResponse add (Key key, Value value) throws IOException {

        String keyString = key.getKey();
        String content = value.getData().toStringUtf8();
        String timestamp =  String.valueOf(value.getTimestamp());
        String version = String.valueOf(value.getVersion());

        this.start();
        RaftClientReply getValue = client.send(Message.valueOf(
                "[REQUEST]" +
                "add" + "," + keyString+
                "," + content +
                "," + timestamp +
                "," + version +
                "[/REQUEST]"
        ));
        client.close();

        String[] response = getValue.getMessage().getContent().toString(Charset.defaultCharset()).split(",");

        Value valueRes;
        if(response[1].equals("ERROR")){
            valueRes = Value.newBuilder().setData(com.google.protobuf.ByteString.copyFromUtf8(response[2]))
                    .setTimestamp(Long.parseLong(response[3]))
                    .setVersion(Long.parseLong(response[4]))
                    .build();
        } else {
            valueRes = Value.newBuilder().build();
        }

        StoreResponse storeResponse = StoreResponse.newBuilder().setStatus(response[1]).setValue(valueRes).build();
        return storeResponse;
    }

    public TestAndSetResponse testAdd (Key key, Value value, long ver) throws IOException {

        String keyString = key.getKey();
        String content = value.getData().toStringUtf8();
        String timestamp =  String.valueOf(value.getTimestamp());
        String version = String.valueOf(ver);

        
        this.start();
        RaftClientReply getValue = client.send(Message.valueOf(
            "[REQUEST]" +
                "testAdd" + "," + keyString+
                "," + content +
                "," + timestamp +
                "," + version +
                "[/REQUEST]"
        ));

        client.close();
        String[] response = getValue.getMessage().getContent().toString(Charset.defaultCharset()).split(",");

        if ("ERROR_NE".equals(response[1])) {
            return TestAndSetResponse
                .newBuilder()
                .setStatus(response[1])
                .build();
        }
        Value val = Value.newBuilder()
            .setData(com.google.protobuf.ByteString.copyFromUtf8(response[2]))
            .setTimestamp(Long.parseLong(response[3]))
            .setVersion(Long.parseLong(response[4]))
            .build();

        return TestAndSetResponse
            .newBuilder()
            .setStatus(response[1])
            .setValue(val)
            .build();
    }

    public ShowResponse get(Key key) throws IOException {
        this.start();
        String keyString = key.getKey();

        RaftClientReply getValue = client.sendReadOnly(Message.valueOf(
                        "[REQUEST]" +
                        "get" + "," + keyString+
                        "[/REQUEST]"
        ));
        client.close();
        String[] response = getValue.getMessage().getContent().toString(Charset.defaultCharset()).split(",");
        Value value;
        if (!response[1].equals("ERROR")) {
            value = Value.newBuilder()
                    .setData(com.google.protobuf.ByteString.copyFromUtf8(response[2]))
                    .setTimestamp(Long.parseLong(response[3]))
                    .setVersion(Long.parseLong(response[4]))
                    .build();
        } else {
            value = Value.newBuilder()
                    .build();
        }


        ShowResponse showResponse = ShowResponse.newBuilder().setStatus(response[1]).setValue(value).build();
        return showResponse;
    }


    public DestroyResponse delete(Key key) throws IOException{
        this.start();
        String keyString = key.getKey();

        RaftClientReply getValue = client.send(Message.valueOf(
                    "[REQUEST]" +
                            "delete" + "," + keyString +
                        "[/REQUEST]"
        ));

        client.close();

        String[] response = getValue.getMessage().getContent().toString(Charset.defaultCharset()).split(",");

        Value value;
        if (!response[1].equals("ERROR")) {

           value = Value.newBuilder().setData(com.google.protobuf.ByteString.copyFromUtf8(response[2]))
                    .setTimestamp(Long.parseLong(response[3]))
                    .setVersion(Long.parseLong(response[4]))
                    .build();
        } else {
            value = Value.newBuilder()
                    .build();
        }

        DestroyResponse destroyResponse = DestroyResponse.newBuilder()
                .setStatus(response[1])
                .setValue(value)
                .build();

        System.out.println(destroyResponse);

        return destroyResponse;
    }


    public DestroyByVersionResponse deleteByVersion(Key key, long version) throws IOException {
        String keyString = key.getKey();

        this.start();
        RaftClientReply getValue = client.send(Message.valueOf(
                "[REQUEST]" +
                        "destroyByVersion" + "," + keyString+
                        "," + version +
                        "[/REQUEST]"
        ));
        client.close();

        String[] response = getValue.getMessage().getContent().toString(Charset.defaultCharset()).split(",");

        Value value;
        if (response[1].equals("ERROR_NE")) {
            value = Value.newBuilder()
                    .build();

        } else if (response[1].equals("ERROR_WV")){
            value = Value.newBuilder()
                    .build();
        }

        else {
            value = Value.newBuilder().setData(com.google.protobuf.ByteString.copyFromUtf8(response[2]))
                    .setTimestamp(Long.parseLong(response[3]))
                    .setVersion(Long.parseLong(response[4]))
                    .build();
        }

        DestroyByVersionResponse  destroyByVersion = DestroyByVersionResponse.newBuilder()
                .setStatus(response[1])
                .setValue(value)
                .build();


        return destroyByVersion;
    }


    public void start() throws IOException
    {
        // ler as propriedades primeiro
        PropertiesReader pr = new PropertiesReader();
        InputStream is = pr.getFileFromResourceAsStream("config.properties");
        Properties prp = new Properties();
        prp.load(is);
        String host = prp.getProperty("host");

        String raftGroupId = prp.getProperty("raftGroupId"); // 16 caracteres.

        Map<String,InetSocketAddress> id2addr = new HashMap<>();
        id2addr.put(String.valueOf(prp.getProperty("process1")),
                new InetSocketAddress(host, Integer.parseInt(prp.getProperty("port1"))));
        id2addr.put(String.valueOf(prp.getProperty("process2")),
                new InetSocketAddress(host,Integer.parseInt(prp.getProperty("port2") )));
        id2addr.put(String.valueOf(prp.getProperty("process3")),
                new InetSocketAddress(host,Integer.parseInt(prp.getProperty("port3") )));

        List<RaftPeer> addresses = id2addr.entrySet()
                .stream()
                .map(e -> new RaftPeer(RaftPeerId.valueOf(e.getKey()), e.getValue()))
                .collect(Collectors.toList());

        final RaftGroup raftGroup = RaftGroup.valueOf(RaftGroupId.valueOf(ByteString.copyFromUtf8(raftGroupId)), addresses);
        RaftProperties raftProperties = new RaftProperties();

        RaftClient client = RaftClient.newBuilder()
                .setProperties(raftProperties)
                .setRaftGroup(raftGroup)
                .setClientRpc(new GrpcFactory(new Parameters())
                        .newRaftClientRpc(ClientId.randomId(), raftProperties))
                .build();

        this.client = client;

    }
}