package SGBD;

import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class WorkerDestroyByVersion implements Callable<DestroyByVersionResponse> {
    private HashMap<Key, Value> hashMap;
    private DestroyByVersionRequest request;
    private DestroyByVersionResponse response;

    public WorkerDestroyByVersion(HashMap<Key, Value> hashMap, DestroyByVersionRequest request) {
        this.hashMap = hashMap;
        this.request = request;
    }

    public HashMap<Key, Value> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Key, Value> hashMap) {
        this.hashMap = hashMap;
    }

    public DestroyByVersionRequest getRequest() {
        return request;
    }

    public void setRequest(DestroyByVersionRequest request) {
        this.request = request;
    }

    @Override
    public DestroyByVersionResponse call() throws Exception {
        Value value = this.hashMap.remove(this.request.getKey());
        DestroyByVersionResponse response = DestroyByVersionResponse.newBuilder()
                .setValue(value)
                .setStatus("SUCCESS")
                .build();

        //TODO: Tem que retornar uma resposta com ERROR_NE se o valor não existir para deleção
        //TODO: retornar ERROR_NW se já tem uma entrada no banco com essa chave mas não com a versão em request

        return response;
    }
}
