package com.baiacu.server;

import org.apache.ratis.conf.RaftProperties;
import org.apache.ratis.grpc.GrpcConfigKeys;
import org.apache.ratis.protocol.RaftGroup;
import org.apache.ratis.protocol.RaftGroupId;
import org.apache.ratis.protocol.RaftPeer;
import org.apache.ratis.protocol.RaftPeerId;
import org.apache.ratis.server.RaftServer;
import org.apache.ratis.server.RaftServerConfigKeys;
import org.apache.ratis.thirdparty.com.google.protobuf.ByteString;
import org.apache.ratis.util.LifeCycle;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import com.baiacu.raft.StateMachine;
import com.beust.jcommander.Parameter;
import utils.PropertiesReader;


public class RaftServerRunner {


    @Parameter(names = "-group", description = "Nome do grupo para ser executado")
    private String groupId;

    @Parameter(names = "-id", description = "Identificador do servidor")
    private String id;

    @Parameter(names = "-port", description = "Identificador do servidor")
    private String port;

    @Parameter(names = "-host", description = "Identificador do servidor")
    private String host;


    //Parametros: myId
    public static void main(String[] args) throws IOException, InterruptedException
    {
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

        //Setup for this node.
        RaftPeerId myId = RaftPeerId.valueOf(args[0]);



        if (addresses.stream().noneMatch(p -> p.getId().equals(myId)))
        {
            System.out.println("Identificador " + args[0] + " é inválido.");
            System.exit(1);
        }

        RaftProperties  properties = new RaftProperties();
        properties.setInt(GrpcConfigKeys.OutputStream.RETRY_TIMES_KEY, Integer.MAX_VALUE);
        GrpcConfigKeys.Server.setPort(properties, id2addr.get(args[0]).getPort());
        RaftServerConfigKeys.setStorageDir(properties, Collections.singletonList(new File("/tmp/" + myId)));

        //Join the group of processes.
        final RaftGroup raftGroup = RaftGroup.valueOf(RaftGroupId.valueOf(ByteString.copyFromUtf8(raftGroupId)), addresses);
        RaftServer raftServer = RaftServer.newBuilder()
                .setServerId(myId)
                .setStateMachine(new StateMachine()).setProperties(properties)
                .setGroup(raftGroup)
                .build();
        raftServer.start();

        while(raftServer.getLifeCycleState() != LifeCycle.State.CLOSED) {
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
