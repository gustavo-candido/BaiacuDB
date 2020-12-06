package com.baiacu.clientAsync;

import com.google.common.util.concurrent.ListenableFuture;
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

import java.util.concurrent.ExecutionException;

public class APICallsAsync {
    private int PORT = 50051;
    private ManagedChannel channel;
    private BaiacuServiceGrpc.BaiacuServiceFutureStub client;

    public APICallsAsync() {
        this.channel = ManagedChannelBuilder.forAddress("localhost",PORT)
                .usePlaintext()
                .build();
         this.client = BaiacuServiceGrpc.newFutureStub(channel);
    }

    public ListenableFuture<StoreResponse> storeCall(Key key, Value value) throws ExecutionException, InterruptedException {

        KeyValue keyValue = KeyValue.newBuilder()
                .setKey(key)
                .setValue(value)
                .build();

        StoreRequest request = StoreRequest.newBuilder().setKeyValue(keyValue).build();
        ListenableFuture<StoreResponse> response = this.client.store(request);
        return response;
    }

    public ListenableFuture<ShowResponse> showCall(Key key) throws ExecutionException, InterruptedException {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",PORT)
                .usePlaintext()
                .build();
      
        ShowRequest request = ShowRequest.newBuilder().setKey(key).build();
        ListenableFuture<ShowResponse> response = this.client.show(request);
        return response;
    }

    public ListenableFuture<TestAndSetResponse> testAndSetCall(Key key, Value value, long version) throws ExecutionException, InterruptedException {
        KeyValue keyValue = KeyValue.newBuilder()
                .setKey(key)
                .setValue(value)
                .build();
        TestAndSetRequest request = TestAndSetRequest.newBuilder().setKeyValue(keyValue)
                .setVersion(version)
                .build();
        ListenableFuture<TestAndSetResponse> response = this.client.testAndSet(request);
        return response;
    }


    public ListenableFuture<DestroyResponse> destroyCall(Key key) throws ExecutionException, InterruptedException {
        DestroyRequest request = DestroyRequest.newBuilder().setKey(key).build();
        ListenableFuture<DestroyResponse> response = this.client.destroy(request);
        return response;
    }

    public ListenableFuture<DestroyByVersionResponse> destroyByVersionCall(Key key, long version) throws ExecutionException, InterruptedException {
        DestroyByVersionRequest request = DestroyByVersionRequest.newBuilder()
                .setKey(key)
                .setVersion(version)
                .build();
        ListenableFuture<DestroyByVersionResponse> response = this.client.destroyByVersion(request);
        return response;
    }




}
