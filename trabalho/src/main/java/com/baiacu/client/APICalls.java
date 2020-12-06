package com.baiacu.client;

import com.proto.baiacu.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class APICalls {
    private int PORT = 50051;
    private ManagedChannel channel;
    private BaiacuServiceGrpc.BaiacuServiceBlockingStub client;

    public APICalls() {
        this.channel = ManagedChannelBuilder.forAddress("localhost",PORT)
                .usePlaintext()
                .build();
         this.client = BaiacuServiceGrpc.newBlockingStub(channel);
    }

    public StoreResponse storeCall(Key key, Value value){

        KeyValue keyValue = KeyValue.newBuilder()
                .setKey(key)
                .setValue(value)
                .build();

        StoreRequest request = StoreRequest.newBuilder().setKeyValue(keyValue).build();
        StoreResponse response = this.client.store(request);
        return response;
    }

    public ShowResponse showCall(Key key) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",PORT)
                .usePlaintext()
                .build();
      
        ShowRequest request = ShowRequest.newBuilder().setKey(key).build();
        ShowResponse response = this.client.show(request);
        return response;
    }

    public TestAndSetResponse testAndSetCall(Key key, Value value, long version){
        KeyValue keyValue = KeyValue.newBuilder()
                .setKey(key)
                .setValue(value)
                .build();
        TestAndSetRequest request = TestAndSetRequest.newBuilder().setKeyValue(keyValue)
                .setVersion(version)
                .build();
        TestAndSetResponse response = this.client.testAndSet(request);
        return response;
    }


    public DestroyResponse destroyCall(Key key) {
        DestroyRequest request = DestroyRequest.newBuilder().setKey(key).build();
        DestroyResponse response = this.client.destroy(request);
        return response;
    }

    public DestroyByVersionResponse destroyByVersionCall(Key key, long version) {
        DestroyByVersionRequest request = DestroyByVersionRequest.newBuilder()
                .setKey(key)
                .setVersion(version)
                .build();
        DestroyByVersionResponse response = this.client.destroyByVersion(request);
        return response;
    }
}
