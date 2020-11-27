package com.baiacu.server;

import com.baiacu.storage.BaiacuStorage;
import io.grpc.Server;
import io.grpc.ServerBuilder;



import java.io.IOException;

public class BaiacuServer {
    private BaiacuStorage storage;
    private static final int PORT = 50053;
    private Server server;

    public BaiacuServer() {
        this.storage = new BaiacuStorage();
    }

    public BaiacuStorage getStorage() {
        return storage;
    }

    public void setStorage(BaiacuStorage storage) {
        this.storage = storage;
    }

    public void start() throws IOException {

        server = ServerBuilder.forPort(PORT)
                .addService(new BaiacuServiceImpl(storage))
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



