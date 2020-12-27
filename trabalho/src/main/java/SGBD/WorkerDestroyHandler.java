package SGBD;

import com.baiacu.raft.RaftClientRunner;
import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class WorkerDestroyHandler implements Callable<DestroyResponse> {
    private DestroyRequest request;

    public WorkerDestroyHandler(DestroyRequest request) {
        this.request = request;
    }

    public DestroyRequest getRequest() {
        return request;
    }

    public void setRequest(DestroyRequest request) {
        this.request = request;
    }

//    TODO: null
    @Override
    public DestroyResponse call() throws Exception {
        Key key = request.getKey();

        RaftClientRunner client = new RaftClientRunner();
        DestroyResponse destroyResponse = client.delete(key);
      return destroyResponse;
    }
}
