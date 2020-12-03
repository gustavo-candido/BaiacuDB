package SGBD;

import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class WorkerStore implements Callable<StoreResponse> {
    private HashMap<Key, Value> hashMap;
    private StoreRequest request;
    private StoreResponse response;

    public WorkerStore(HashMap<Key, Value> hashMap, StoreRequest request) {
        this.hashMap = hashMap;
        this.request = request;
    }

    public HashMap<Key, Value> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Key, Value> hashMap) {
        this.hashMap = hashMap;
    }

    public StoreRequest getRequest() {
        return request;
    }

    public void setRequest(StoreRequest request) {
        this.request = request;
    }

    @Override
    public StoreResponse call() throws Exception {
        this.hashMap.put(request.getKeyValue().getKey(), request.getKeyValue().getValue());
        StoreResponse response = StoreResponse.newBuilder()
                .setValue(request.getKeyValue().getValue())
                .setStatus("SUCCESS")
                .build();

        //TODO: deve retornar erro se existir uma entrada no banco com essa Chave K e dados iguais
        return response;
    }
}
