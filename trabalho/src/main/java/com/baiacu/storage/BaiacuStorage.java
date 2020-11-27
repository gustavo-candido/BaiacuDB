package com.baiacu.storage;

import com.baiacu.storage.Exception.StorageException;
import com.proto.baiacu.Key;
import com.proto.baiacu.Value;

import java.util.HashMap;

public class BaiacuStorage {
    private HashMap<Key, Value> DatabaseMap;

    public BaiacuStorage() {
        this.DatabaseMap = new HashMap<Key, Value>();
    }

    public boolean  setValue(Key key, Value value)  {
        Value data = DatabaseMap.get(key);

        if (data != null) {
            throw new StorageException("\uD83D\uDEA9️Search for a unknow Key");
        }

        DatabaseMap.put(key, value);

        return true;
    }



    public Value getValue(Key key){
        Value value  = DatabaseMap.get(key);

        if (value != null) {
            throw new StorageException("\uD83D\uDEA9️Search for a unknow Key");
        }

        return value;
    }


}
