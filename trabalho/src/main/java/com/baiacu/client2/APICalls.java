package com.baiacu.client2;

import com.proto.baiacu.BaiacuServiceGrpc;
import com.proto.baiacu.DestroyByVersionRequest;
import com.proto.baiacu.DestroyByVersionResponse;
import com.proto.baiacu.DestroyRequest;
import com.proto.baiacu.DestroyResponse;
import com.proto.baiacu.Key;
import com.proto.baiacu.KeyValue;
import com.proto.baiacu.ShowRequest;
import com.proto.baiacu.ShowResponse;
import com.proto.baiacu.StoreRequest;
import com.proto.baiacu.StoreResponse;
import com.proto.baiacu.TestAndSetRequest;
import com.proto.baiacu.TestAndSetResponse;
import com.proto.baiacu.Value;
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

    public TestAndSetResponse testAndSetCall(Key key, Value value, int version){
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

    public DestroyByVersionResponse destroyByVersionCall(Key key, int version) {
        DestroyByVersionRequest request = DestroyByVersionRequest.newBuilder()
                .setKey(key)
                .setVersion(version)
                .build();
        DestroyByVersionResponse response = this.client.destroyByVersion(request);
        return response;
    }




}
