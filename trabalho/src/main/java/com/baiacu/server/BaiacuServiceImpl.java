package com.baiacu.server;

import com.baiacu.storage.BaiacuStorage;
import com.baiacu.storage.Exception.StorageException;
import com.proto.baiacu.*;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;



public class BaiacuServiceImpl extends BaiacuServiceGrpc.BaiacuServiceImplBase  {
    private BaiacuStorage storage;

    public BaiacuServiceImpl(BaiacuStorage storage) {
        this.storage = storage;
    }


    @Override
    public void store(StoreRequest request, StreamObserver<StoreResponse> responseObserver) {
        Key key = request.getKeyValue().getKey();
        Value value = request.getKeyValue().getValue();

        storage.setValue(key, value);

        StoreResponse response = StoreResponse.newBuilder()
                .setStatus("SUCESS")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void show(ShowRequest request, StreamObserver<ShowResponse> responseObserver) {
        Key key = request.getKey();
        Value value = storage.getValue(key);

        ShowResponse response = ShowResponse.newBuilder()
                .setValue(value)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void destroy(DestroyRequest request, StreamObserver<DestroyResponse> responseObserver) {
        super.destroy(request, responseObserver);
    }

    @Override
    public void destroyByVersion(DestroyByVersionRequest request, StreamObserver<DestroyByVersionResponse> responseObserver) {
        super.destroyByVersion(request, responseObserver);
    }

    @Override
    public void testAndSet(TestAndSetRequest request, StreamObserver<TestAndSetResponse> responseObserver) {
        super.testAndSet(request, responseObserver);
    }

}
