package SGBD;

import com.proto.baiacu.Key;
import com.proto.baiacu.Value;
import java.util.HashMap;

public class Worker implements Runnable{
    private HashMap<Key, Value> hashMap;

    public Worker(HashMap<Key, Value> hashMap) {
        this.hashMap = hashMap;
    }


    @Override
    public void run() {

    }

}
