package com.baiacu.raft.workes;

import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.Value;
import java.util.Map;

public class TestSet {

    public String run(Map<Key, Value> key2values, String[] opKeyValue) {
        Key key = Key.newBuilder().setKey(opKeyValue[1]).build();
        String showResponse = "TEST_AND_SET_RESPONSE";

        if (!key2values.containsKey(key)) {
            showResponse = showResponse +"," + "ERROR_NE";
            return showResponse;
        }

        Value dbValue = key2values.get(key);
        Value reqValue = Value.newBuilder()
            .setData(ByteString.copyFromUtf8(opKeyValue[2]))
            .setTimestamp(Long.parseLong(opKeyValue[3]))
            .setVersion(Long.parseLong(opKeyValue[4]))
            .build();

        if (dbValue.getVersion() != reqValue.getVersion()) {

            String content = dbValue.getData().toStringUtf8();
            String timestamp =  String.valueOf(dbValue.getTimestamp());
            String version = String.valueOf(dbValue.getVersion());

            showResponse+= "," + "ERROR_WV" + "," + content + "," + timestamp + "," + version;
            return showResponse;
        }

        Value updatedValue = Value.newBuilder()
            .setTimestamp(reqValue.getTimestamp())
            .setData(reqValue.getData())
            .setVersion(dbValue.getVersion() + 1)
            .build();

        key2values.put(key, updatedValue);

        String content = updatedValue.getData().toStringUtf8();
        String timestamp =  String.valueOf(updatedValue.getTimestamp());
        String version = String.valueOf(updatedValue.getVersion());

        showResponse+= "," + "SUCCESS" + "," + content + "," + timestamp + "," + version;
        return showResponse;
    }
}
