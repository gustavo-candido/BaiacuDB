package com.baiacu.raft;

import com.proto.baiacu.StoreResponse;
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


    public StoreResponse add (String key, String content, String timestamp, String version ) throws IOException {
        this.start();
        RaftClientReply getValue = client.send(Message.valueOf(
                "[REQUEST]" +
                "add" + "," + key+
                "," + content +
                "," + timestamp +
                "," + version +
                "[/REQUEST]"
        ));

        String response = getValue.getMessage().getContent().toString(Charset.defaultCharset());
        System.out.println(response);
        System.out.println(response);
        client.close();

        try {
            byte b[] = response.getBytes();
            ByteArrayInputStream bi = new ByteArrayInputStream(b);
            ObjectInputStream si = new ObjectInputStream(bi);;
            StoreResponse storeResponse = (StoreResponse) si.readObject();
            System.out.println(storeResponse);
            return storeResponse;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void get(String key ) throws IOException {
        this.start();
        RaftClientReply getValue = client.sendReadOnly(Message.valueOf("get:" + key));
        String response = getValue.getMessage().getContent().toString(Charset.defaultCharset());
        System.out.println(response);
        client.close();
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