package com.baiacu.storage;

import com.baiacu.storage.Exception.StorageException;
import com.proto.baiacu.Key;
import com.proto.baiacu.Value;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class BaiacuStorage {
    private ConcurrentHashMap<Key, Value> DatabaseMap;
    public BaiacuStorage() {
        this.DatabaseMap = new ConcurrentHashMap<Key, Value>();
    }

    public boolean setValue(Key key, Value value)  {
        DatabaseMap.put(key, value);
        return true;
    }

    public Value getValue(Key key){
        Value value  = DatabaseMap.get(key);
        return value;
    }


}
