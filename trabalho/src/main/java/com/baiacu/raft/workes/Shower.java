package com.baiacu.raft.workes;

import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.ShowResponse;
import com.proto.baiacu.Value;

import java.util.Map;

public class Shower {


    public String run(Map<Key, Value> key2values, String[] opKeyValue) {

        Key key = Key.newBuilder().setKey(opKeyValue[1]).build();



        String showResponse = "SHOW_RESPONSE";

        if (!key2values.containsKey(key)) {
            showResponse = showResponse +"," + "ERROR";
            return showResponse;
        }


        Value value = key2values.get(key);
        String keyString = key.getKey();
        String content = value.getData().toStringUtf8();
        String timestamp =  String.valueOf(value.getTimestamp());
        String version = String.valueOf(value.getVersion());



        showResponse =  showResponse + "," + "SUCCESS"
            + "," + content + "," + timestamp + "," + version
        ;
        return showResponse;
    }
}
