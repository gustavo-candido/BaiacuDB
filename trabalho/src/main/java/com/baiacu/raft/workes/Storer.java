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


        String storeResponse = "STORE_RESPONSE";
        if (key2values.containsKey(key)) {
            Value value = key2values.get(key);
            String content = value.getData().toStringUtf8();
            String timestamp =  String.valueOf(value.getTimestamp());
            String version = String.valueOf(value.getVersion());
            storeResponse =  storeResponse + "," + "ERROR" + ","
            + content + "," + timestamp + "," + version;
            return storeResponse;
        }


        Value value = Value.newBuilder()
                .setData(ByteString.copyFromUtf8(opKeyValue[2]))
                .setTimestamp(Long.parseLong(opKeyValue[3]))
                .setVersion(Long.parseLong(opKeyValue[4]))
                .build();

        key2values.put(key,value);


        storeResponse =  storeResponse + "," + "SUCCESS";
        return storeResponse;
    }
}
