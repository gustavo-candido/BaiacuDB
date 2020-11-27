package com.baiacu.storage;

import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.Value;
import java.sql.Timestamp;
import java.util.HashMap;

public class FakeStorageClient {
    public static void main(String[] args) {
//        BaiacuStorage baiacuStorage = new BaiacuStorage();
//
//        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());
//
//        String alo = "jaslkdjasld";
//        ByteString bytes = ByteString.copyFrom(alo.getBytes());
//
//        Key key = Key
//            .newBuilder()
//            .setKey("1")
//            .build();
//
//        Value value = Value
//            .newBuilder()
//            .setVersion(1L)
//            .setTimestamp(dataDeHoje.getTime())
//            .setData(bytes)
//            .build();
//
//        if (baiacuStorage.setValue(key, value)) {
//            System.out.println("funcionando");
//        }

        HashMap<Integer,Integer> m = new HashMap<>();

        System.out.println(m.put(2,4));
        System.out.println(m.put(2,4));
    }
}
