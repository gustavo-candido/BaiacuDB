package com.baiacu.server;

import com.baiacu.storage.BaiacuStorage;
import com.proto.baiacu.*;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;



public class BaiacuServiceImpl extends BaiacuServiceGrpc.BaiacuServiceImplBase {
    private BaiacuStorage storage;

    public BaiacuServiceImpl(BaiacuStorage storage) {
        this.storage = storage;
    }


    @Override
    public void store(StoreRequest request, StreamObserver<StoreResponse> responseObserver) {
        Key key = request.getKeyValue().getKey();
        Value value = request.getKeyValue().getValue();




        //TODO: todo o processo de guardar a informação na tabela key-value
        //TODO: depois de armazenado retornar null se o key-value foi armazenado






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
        Key key = request.getKeyValue().getKey();

        //TODO: retira a informação do banco
        //TODO:




        //super.show(request, responseObserver);

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
