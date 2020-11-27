package com.baiacu.server;

import com.proto.baiacu.*;
import io.grpc.stub.StreamObserver;

public class BaiacuServiceImpl extends BaiacuServiceGrpc.BaiacuServiceImplBase {

    @Override
    public void store(StoreRequest request, StreamObserver<StoreResponse> responseObserver) {
        KeyValue keyValue = request.getKeyValue();




        //TODO: todo o processo de guardar a informação na tabela key-value
        //TODO: depois de armazenado retornar o key-value armazenado





        // constrói a respota
        StoreResponse response = StoreResponse.newBuilder()
                .setStatus("SUCESS")
                .build();

        // envia a resposta
        responseObserver.onNext(response);
        responseObserver.onCompleted();

        //super.store(request, responseObserver);
    }

    @Override
    public void show(ShowRequest request, StreamObserver<ShowResponse> responseObserver) {
        super.show(request, responseObserver);
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
