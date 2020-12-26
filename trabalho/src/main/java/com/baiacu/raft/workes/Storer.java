package com.baiacu.raft.workes;

import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.StoreResponse;
import com.proto.baiacu.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Storer {
    Logger LOG = LoggerFactory.getLogger(Storer.class);



    public StoreResponse run(Map<Key, Value> key2values, String[] opKeyValue) {
        Key key = Key.newBuilder().setKey(opKeyValue[1]).build();
        Value value = Value.newBuilder()
                .setData(ByteString.copyFromUtf8(opKeyValue[2]))
                .setTimestamp(Long.parseLong(opKeyValue[3]))
                .setVersion(Long.parseLong(opKeyValue[4]))
                .build();
        key2values.put(key,value);

        if (key2values.containsKey(key)) {
            return  StoreResponse.newBuilder()
                    .setStatus("ERROR")
                    .setValue(key2values.get(key))
                    .build();
        }


        return StoreResponse.newBuilder()
                .setStatus("SUCCESS")
                .build();
    }
}
