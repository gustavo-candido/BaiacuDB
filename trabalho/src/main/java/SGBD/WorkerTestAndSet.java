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
        Key key = request.getKeyValue().getKey();

        if (!hashMap.containsKey(key)) {
            return  TestAndSetResponse.newBuilder()
                .setStatus("ERROR_NE")
                .build();
        }

        Value dbValue = hashMap.get(key);
        Value reqValue = request.getKeyValue().getValue();

        long version = dbValue.getVersion();

        if (version != request.getVersion()) {
            return  TestAndSetResponse.newBuilder()
                .setStatus("ERROR_WV")
                .setValue(hashMap.get(key))
                .build();
        }

        Value updatedValue = Value.newBuilder()
            .setTimestamp(reqValue.getTimestamp())
            .setData(reqValue.getData())
            .setVersion(dbValue.getVersion() + 1)
            .build();

        hashMap.put(key, updatedValue);

        return TestAndSetResponse.newBuilder()
            .setStatus("SUCCESS")
            .setValue(updatedValue)
            .build();
    }
}
