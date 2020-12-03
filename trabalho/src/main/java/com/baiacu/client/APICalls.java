package com.baiacu.client;

import com.proto.baiacu.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class APICalls {
    public StoreResponse storeCall(Key key, Value value){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50054)
                .usePlaintext()
                .build();

        BaiacuServiceGrpc.BaiacuServiceBlockingStub client =  BaiacuServiceGrpc.newBlockingStub(channel);


        KeyValue keyValue = KeyValue.newBuilder()
                .setKey(key)
                .setValue(value)
                .build();

        StoreRequest request = StoreRequest.newBuilder().setKeyValue(keyValue).build();

        StoreResponse response = client.store(request);
        channel.shutdown();

        return response;
    }

    public ShowResponse showCall(Key key) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50054)
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
