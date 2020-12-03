package com.baiacu.client;

import com.proto.baiacu.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class APICalls {
    private int PORT = 50051;

    public StoreResponse storeCall(Key key, Value value){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",PORT)
                .usePlaintext()
                .build();

        BaiacuServiceGrpc.BaiacuServiceBlockingStub client =  BaiacuServiceGrpc.newBlockingStub(channel);

        KeyValue keyValue = KeyValue.newBuilder()
                .setKey(key)
                .setValue(value)
                .build();

        StoreRequest request = StoreRequest.newBuilder().setKeyValue(keyValue).build();

        StoreResponse response = client.store(request);

        System.out.println(response);

        if (request.getKeyValue().getValue() == null) {
            System.out.println("Okay");
        }
        else {
            System.out.println("Null com problemas");
        }

        channel.shutdown();

        return response;
    }

    public ShowResponse showCall(Key key) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",PORT)
                .usePlaintext()
                .build();

        BaiacuServiceGrpc.BaiacuServiceBlockingStub client =  BaiacuServiceGrpc.newBlockingStub(channel);

        ShowRequest request = ShowRequest.newBuilder().setKey(key).build();

        ShowResponse response = client.show(request);
        System.out.println(response.getValue());

        channel.shutdown();

        return response;
    }
}
