package SGBD;

import com.baiacu.raft.RaftClientRunner;
import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class WorkerDestroyerByVersion implements Callable<DestroyByVersionResponse> {
    private DestroyByVersionRequest request;

    public WorkerDestroyerByVersion(DestroyByVersionRequest request) {
        this.request = request;
    }

    public DestroyByVersionRequest getRequest() {
        return request;
    }

    public void setRequest(DestroyByVersionRequest request) {
        this.request = request;
    }

//    TODO null
    @Override
    public DestroyByVersionResponse call() throws Exception {
        Key key = request.getKey();
        long version = request.getVersion();
        RaftClientRunner client = new RaftClientRunner();

        DestroyByVersionResponse destroyByVersionResponse = client.deleteByVersion(key,version);
        return destroyByVersionResponse;
    }
}
