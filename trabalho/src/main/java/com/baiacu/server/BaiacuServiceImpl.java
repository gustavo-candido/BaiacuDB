package com.baiacu.server;

import com.proto.baiacu.*;
import io.grpc.stub.StreamObserver;

public class BaiacuServiceImpl extends BaiacuServiceGrpc.BaiacuServiceImplBase {

    @Override
    public void store(storeRequest request, StreamObserver<storeResponse> responseObserver) {
        super.store(request, responseObserver);
    }

    @Override
    public void show(showRequest request, StreamObserver<showResponse> responseObserver) {
        super.show(request, responseObserver);
    }

    @Override
    public void destroy(destroyRequest request, StreamObserver<destroyResponse> responseObserver) {
        super.destroy(request, responseObserver);
    }

    @Override
    public void destroyByVersion(destroyByVersionRequest request, StreamObserver<destroyByVersionResponse> responseObserver) {
        super.destroyByVersion(request, responseObserver);
    }

    @Override
    public void testAndSet(testAndSetRequest request, StreamObserver<testAndSetResponse> responseObserver) {
        super.testAndSet(request, responseObserver);
    }
}
