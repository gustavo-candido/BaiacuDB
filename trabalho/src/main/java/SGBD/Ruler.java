package SGBD;

import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Ruler {
    private int MAX_T = 3;
    private HashMap<Key, Value> data = new HashMap<>();
    private ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
    Semaphore sem = new Semaphore(1);


    public HashMap<Key, Value> getData() {
        return data;
    }

    public void setData(
        HashMap<Key, Value> data) {
        this.data = data;
    }

    public StoreResponse storeHandler(StoreRequest request) throws InterruptedException {
        sem.acquire();
        Future<StoreResponse> submit = pool.submit(new WorkerStore(data, request));
        try {
            StoreResponse storeResponse = submit.get();
            sem.release();
            return storeResponse;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            sem.release();
            return null;
        }
    }

    public ShowResponse showHandler(ShowRequest request)
        throws ExecutionException, InterruptedException {
        sem.acquire();
        sem.release();
        Future<ShowResponse> submit = pool.submit(new WorkerShow(data, request));
        try {
            return submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public DestroyResponse destroyHandler(DestroyRequest request)
        throws ExecutionException, InterruptedException {
        sem.acquire();
        Future<DestroyResponse> submit = pool.submit(new WorkerDestroy(data, request));
        try {
            DestroyResponse destroyResponse = submit.get();
            sem.release();
            return destroyResponse;
        } catch (InterruptedException e) {
            e.printStackTrace();
            sem.release();
            return null;
        }



    }

    public DestroyByVersionResponse destroyByVersionHandler(DestroyByVersionRequest request)
        throws InterruptedException {
        sem.acquire();
        Future<DestroyByVersionResponse> submit = pool.submit(new WorkerDestroyByVersion(data, request));
        try {
            DestroyByVersionResponse destroyByVersionResponse = submit.get();
            sem.release();
            return destroyByVersionResponse;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            sem.release();
            return null;
        }
    }

    public TestAndSetResponse testAndSetHandler(TestAndSetRequest request)
        throws InterruptedException {
        Future<TestAndSetResponse> submit = pool.submit(new WorkerTestAndSet(data, request));
        sem.acquire();
        try {
            TestAndSetResponse testAndSetResponse = submit.get();
            sem.release();
            return testAndSetResponse;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            sem.release();
            return null;
        }
    }
}
