package com.baiacu.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class BaiacuServer {
    private static final int PORT = 50053;
    private Server server;


    public void start() throws IOException {
        server = ServerBuilder.forPort(PORT)
                .addService(new BaiacuServiceImpl())
                .build()
                .start();
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server == null) {
            return;
        }

        server.awaitTermination();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
            BaiacuServer server = new BaiacuServer();
            server.start();
            server.blockUntilShutdown();
        }
    }



