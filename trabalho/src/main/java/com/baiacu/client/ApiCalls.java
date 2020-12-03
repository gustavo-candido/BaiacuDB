package com.baiacu.client;

import com.google.protobuf.ByteString;
import com.proto.baiacu.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ApiCalls {
    public void StoreCall(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50054)
                .usePlaintext()
                .build();

        BaiacuServiceGrpc.BaiacuServiceBlockingStub client =  BaiacuServiceGrpc.newBlockingStub(channel);

        Value value  = Value.newBuilder()
                .setData(ByteString.copyFromUtf8("testreee carai"))
                .setTimestamp(12345)
                .setVersion(1)
                .build();

        Key key = Key.newBuilder().setKey("123456789").build();
        KeyValue keyValue = KeyValue.newBuilder()
                .setKey(key)
                .setValue(value)
                .build();

        StoreRequest request = StoreRequest.newBuilder().setKeyValue(keyValue).build();

        StoreResponse response = client.store(request);
        System.out.println(response);

        channel.shutdown();
    }

    public void showCall() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50054)
                .usePlaintext()
                .build();

        BaiacuServiceGrpc.BaiacuServiceBlockingStub client =  BaiacuServiceGrpc.newBlockingStub(channel);

        Key key = Key.newBuilder().setKey("123456789").build();
        ShowRequest request = ShowRequest.newBuilder().setKey(key).build();

        ShowResponse response = client.show(request);
        System.out.println(response.getValue());

        channel.shutdown();
    }
}
