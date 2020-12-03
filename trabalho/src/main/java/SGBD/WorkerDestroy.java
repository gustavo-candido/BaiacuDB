package SGBD;

import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class WorkerDestroy implements Callable<DestroyResponse> {
    private HashMap<Key, Value> hashMap;
    private DestroyRequest request;
    private DestroyResponse response;

    public WorkerDestroy(HashMap<Key, Value> hashMap, DestroyRequest request) {
        this.hashMap = hashMap;
        this.request = request;
    }

    public HashMap<Key, Value> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Key, Value> hashMap) {
        this.hashMap = hashMap;
    }

    public DestroyRequest getRequest() {
        return request;
    }

    public void setRequest(DestroyRequest request) {
        this.request = request;
    }

    @Override
    public DestroyResponse call() throws Exception {
        Value value = this.hashMap.remove(this.request.getKey());
        DestroyResponse response = DestroyResponse.newBuilder()
                .setValue(value)
                .setStatus("SUCCESS")
                .build();

        //TODO: Tem que retornar uma resposta com ERROR se o valor não existir para deleção
        return response;
    }
}
