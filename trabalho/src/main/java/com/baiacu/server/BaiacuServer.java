package com.baiacu.server;

import SGBD.Ruler;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BaiacuServer {
    private Ruler ruler;
    private static int PORT = 50051;
    private Server server;

    public BaiacuServer() throws IOException, ClassNotFoundException {
        this.ruler = new Ruler();
    }

    public void start() throws IOException {
        ExecutorService executor = Executors.newFixedThreadPool(8);

        server = ServerBuilder.forPort(PORT)
                .addService( new BaiacuServiceImpl(ruler))
                .executor(executor)
                .build()
                .start();
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server == null) {
            return;
        }

        server.awaitTermination();
    }

    public static void main(String[] args)
        throws IOException, InterruptedException, ClassNotFoundException {
            BaiacuServer server = new BaiacuServer();
            server.start();
            server.blockUntilShutdown();
        }
    }



