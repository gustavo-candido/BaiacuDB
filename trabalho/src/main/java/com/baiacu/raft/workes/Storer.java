package com.baiacu.raft.workes;

import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.StoreResponse;
import com.proto.baiacu.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class Storer {
    Logger LOG = LoggerFactory.getLogger(Storer.class);
    public String run(Map<Key, Value> key2values, String[] opKeyValue) {
        Key key = Key.newBuilder().setKey(opKeyValue[1]).build();
        Value value = Value.newBuilder()
                .setData(ByteString.copyFromUtf8(opKeyValue[2]))
                .setTimestamp(Long.parseLong(opKeyValue[3]))
                .setVersion(Long.parseLong(opKeyValue[4]))
                .build();
        key2values.put(key,value);

        StoreResponse storeResponse;
        if (key2values.containsKey(key)) {
            storeResponse =  StoreResponse.newBuilder()
                    .setStatus("ERROR")
                    .setValue(key2values.get(key))
                    .build();
        } else {
             storeResponse = StoreResponse.newBuilder()
                    .setStatus("SUCCESS")
                    .build();
        }

        String serializedObject = "";
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream so = new ObjectOutputStream(bo);
            so.writeObject(storeResponse);
            so.flush();
            serializedObject = bo.toString();
        } catch (Exception e) {
            System.out.println(e);
        }

        return serializedObject;
    }
}
