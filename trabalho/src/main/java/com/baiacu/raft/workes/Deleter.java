package com.baiacu.raft.workes;

import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Deleter {
    Logger LOG = LoggerFactory.getLogger(Deleter.class);

    public String run(Map<Key, Value> key2values, String[] opKeyValue) {
        Key key = Key.newBuilder().setKey(opKeyValue[1]).build();

        String destroyResponse = "DESTROY_RESPONSE";
        if (!key2values.containsKey(key)) {
            destroyResponse =  destroyResponse + "," + "ERROR" ;
            return destroyResponse;
        }

        Value value = key2values.get(key);
        key2values.remove(key);

        String content = value.getData().toStringUtf8();
        String timestamp =  String.valueOf(value.getTimestamp());
        String version = String.valueOf(value.getVersion());



        destroyResponse =  destroyResponse + "," + "SUCCESS"
        + "," + content + "," + timestamp + "," + version;

        LOG.debug(destroyResponse);
        return destroyResponse;
    }
}
