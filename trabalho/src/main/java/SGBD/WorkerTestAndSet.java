package SGBD;

import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class WorkerTestAndSet implements Callable<TestAndSetResponse> {
    private HashMap<Key, Value> hashMap;
    private TestAndSetRequest request;
    private TestAndSetResponse response;

    public WorkerTestAndSet(HashMap<Key, Value> hashMap, TestAndSetRequest request) {
        this.hashMap = hashMap;
        this.request = request;
    }

    public HashMap<Key, Value> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Key, Value> hashMap) {
        this.hashMap = hashMap;
    }

    public TestAndSetRequest getRequest() {
        return request;
    }

    public void setRequest(TestAndSetRequest request) {
        this.request = request;
    }

    @Override
    public TestAndSetResponse call() throws Exception {
        TestAndSetResponse response = TestAndSetResponse.newBuilder()
                .setStatus("SUCCESS")
                .build();

        //TODO: Tem que retornar uma resposta com ERROR_NE se o valor não existir para deleção
        //TODO: retornar ERROR_NW se já tem uma entrada no banco com essa chave mas não com a versão em request

        return response;
    }
}
