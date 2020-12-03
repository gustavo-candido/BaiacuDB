package com.baiacu.server;

import SGBD.Ruler;
import com.proto.baiacu.*;
import io.grpc.stub.StreamObserver;


public class BaiacuServiceImpl extends BaiacuServiceGrpc.BaiacuServiceImplBase  {
    private Ruler ruler;

    public BaiacuServiceImpl(Ruler ruler) {
        this.ruler = ruler;
    }


    @Override
    public void store(StoreRequest request, StreamObserver<StoreResponse> responseObserver) {
        try{
            StoreResponse response = ruler.storeHandler(request);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e){
            StoreResponse response = StoreResponse.newBuilder()
                    .setStatus("erro inesperado")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void show(ShowRequest request, StreamObserver<ShowResponse> responseObserver) {
        try {
            ShowResponse response = ruler.showHandler(request);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            ShowResponse response = ShowResponse.newBuilder()
                    .setStatus("erro inesperado")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void destroy(DestroyRequest request, StreamObserver<DestroyResponse> responseObserver) {
        try {
            DestroyResponse response = ruler.destroyHandler(request);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            DestroyResponse response = DestroyResponse.newBuilder()
                    .setStatus("erro inesperado")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

    }

    @Override
    public void destroyByVersion(DestroyByVersionRequest request, StreamObserver<DestroyByVersionResponse> responseObserver) {
        try {
            DestroyByVersionResponse response = ruler.destroyByVersionHandler(request);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            DestroyByVersionResponse response = DestroyByVersionResponse.newBuilder()
                    .setStatus("erro inesperado")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

    }

    @Override
    public void testAndSet(TestAndSetRequest request, StreamObserver<TestAndSetResponse> responseObserver) {
        try {
            TestAndSetResponse response = ruler.testAndSetHandler(request);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            TestAndSetResponse response = TestAndSetResponse.newBuilder()
                    .setStatus("erro inesperado")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

    }

}
