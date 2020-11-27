package com.baiacu.storage;

import com.proto.baiacu.Key;
import com.proto.baiacu.KeyValue;
import com.proto.baiacu.Value;

import java.util.HashMap;
import java.util.Optional;

public class BaiacuStorage {
    private HashMap<Key, Value> DatabaseMap;

    public BaiacuStorage() {
        this.DatabaseMap = new HashMap<Key, Value>();
    }

    public boolean  setValue(Key key, Value value)  {





        return true;
    }



    public Value getValue(Key key){
        Value value  = DatabaseMap.get(key);


        return value;
    }


}
