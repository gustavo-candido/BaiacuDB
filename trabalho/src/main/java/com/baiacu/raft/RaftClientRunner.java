package com.baiacu.raft;

import com.proto.baiacu.*;
import java.util.Arrays;
import org.apache.ratis.client.RaftClient;
import org.apache.ratis.conf.Parameters;
import org.apache.ratis.conf.RaftProperties;
import org.apache.ratis.grpc.GrpcFactory;
import org.apache.ratis.protocol.*;
import org.apache.ratis.thirdparty.com.google.protobuf.ByteString;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        StoreResponse storeResponse = StoreResponse.newBuilder().setStatus(response[1]).build();
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
        Value value = Value.newBuilder()
                .setData(com.google.protobuf.ByteString.copyFromUtf8(response[2]))
                .setTimestamp(Long.parseLong(response[3]))
                .setVersion(Long.parseLong(response[4]))
                .build();

        ShowResponse showResponse = ShowResponse.newBuilder().setStatus(response[1]).setValue(value).build();
        return showResponse;
    }

    public void start() throws IOException
    {
        String raftGroupId = "raft_group____um"; // 16 caracteres.

        Map<String,InetSocketAddress> id2addr = new HashMap<>();
        id2addr.put("p1", new InetSocketAddress("127.0.0.1", 3000));
        id2addr.put("p2", new InetSocketAddress("127.0.0.1", 3500));
        id2addr.put("p3", new InetSocketAddress("127.0.0.1", 4000));


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

/*
        switch (args[0]){
            case "add":
                getValue = client.send(Message.valueOf("add:" + args[1] + ":" + args[2]));
                response = getValue.getMessage().getContent().toString(Charset.defaultCharset());
                System.out.println("Resposta:" + response);
                break;
            case "get":
                getValue = client.sendReadOnly(Message.valueOf("get:" + args[1]));
                response = getValue.getMessage().getContent().toString(Charset.defaultCharset());
                System.out.println("Resposta:" + response);
                break;
            default:
                System.out.println("comando inválido");
        }
*/

    }
}