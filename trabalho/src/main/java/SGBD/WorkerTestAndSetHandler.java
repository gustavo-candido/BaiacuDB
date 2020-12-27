package SGBD;

import com.baiacu.raft.RaftClientRunner;
import com.proto.baiacu.*;

import java.util.concurrent.Callable;

public class WorkerTestAndSetHandler implements Callable<TestAndSetResponse> {
    private TestAndSetRequest request;

    public WorkerTestAndSetHandler(TestAndSetRequest request) {
        this.request = request;
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
        Value value = request.getKeyValue().getValue();
        long version = request.getVersion();

        RaftClientRunner client  = new RaftClientRunner();

        return client.testAdd(key, value, version);
    }
}
