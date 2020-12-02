package com.baiacu.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BaiacuCliente {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50054);




    }
}
