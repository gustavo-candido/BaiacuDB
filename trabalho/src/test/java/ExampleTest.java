import com.baiacu.client.APICalls;
import com.baiacu.client.BaiacuClient;
import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.ShowResponse;
import com.proto.baiacu.StoreResponse;
import com.proto.baiacu.Value;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    private APICalls api;

    ExampleTest() {
        api = new APICalls();
    }

    @Test
    @DisplayName("Deveria retornar SUCCESS ao guardar valor")
    void shouldStoreValue() {
        Value value  = Value.newBuilder().build();
        Key key = Key.newBuilder().build();

        value  = Value.newBuilder()
                .setData(ByteString.copyFromUtf8("teste"))
                .setTimestamp(12345)
                .setVersion(1)
                .build();

        key = Key.newBuilder().setKey("123456789").build();
        StoreResponse response = api.storeCall(key,value);
        Assertions.assertEquals("SUCCESS", response.getStatus());
    }

    @Test
    @DisplayName("Deveria guardar um valor e ser capaz de retornar ele")
    void ShouldGetValue() {
        Value value  = Value.newBuilder().build();
        Key key = Key.newBuilder().build();

        value  = Value.newBuilder()
                .setData(ByteString.copyFromUtf8("teste"))
                .setTimestamp(12345)
                .setVersion(1)
                .build();

        key = Key.newBuilder().setKey("123456789").build();
        StoreResponse storeResponse = api.storeCall(key,value);
        Assertions.assertEquals("SUCCESS", storeResponse.getStatus());

        ShowResponse showResponse = api.showCall(key);


        Assertions.assertEquals(value, showResponse.getValue());
    }
}
