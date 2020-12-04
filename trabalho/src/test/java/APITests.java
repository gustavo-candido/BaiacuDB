import com.baiacu.client.APICalls;
import com.baiacu.client.BaiacuClient;
import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.ShowResponse;
import com.proto.baiacu.StoreResponse;
import com.proto.baiacu.Value;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class APITests {
    private APICalls api;

    APITests() {
        api = new APICalls();
    }



    @Nested
    @DisplayName("testes dos casos de set(k,ts,d):(e,v')")
    class StoreTests {

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

            key = Key.newBuilder().setKey("1").build();
            StoreResponse response = api.storeCall(key,value);
            Assertions.assertEquals("SUCCESS", response.getStatus());
        }

        @Test
        @DisplayName("Deveria retornar ERROR ao guardar valor igual ao que já existe naquela chave")
        void shouldErrorInStoreValue() {
            Value value  = Value.newBuilder().build();
            Key key = Key.newBuilder().build();

            value  = Value.newBuilder()
                    .setData(ByteString.copyFromUtf8("teste"))
                    .setTimestamp(12345)
                    .setVersion(1)
                    .build();

            key = Key.newBuilder().setKey("2").build();
            StoreResponse response = api.storeCall(key,value);
            StoreResponse responseAgain = api.storeCall(key,value);
            Assertions.assertEquals("ERROR", responseAgain.getStatus());
        }

    }

    @Nested
    @DisplayName("testes dos casos de get(k):(e,v')")
    class showTests {

        @Test
        @DisplayName("Deveria ser capaz de retornar um valor guardado anteriormente e retornar SUCCESS junto com" +
                "o valor da chave respectiva")
        void ShouldGetValue() {
            Value value  = Value.newBuilder().build();
            Key key = Key.newBuilder().build();

            value  = Value.newBuilder()
                    .setData(ByteString.copyFromUtf8("teste"))
                    .setTimestamp(12345)
                    .setVersion(1)
                    .build();

            key = Key.newBuilder().setKey("2").build();
            StoreResponse storeResponse = api.storeCall(key,value);
            Assertions.assertEquals("SUCCESS", storeResponse.getStatus());
            ShowResponse showResponse = api.showCall(key);
            Assertions.assertEquals(value, showResponse.getValue());
        }


        @Test
        @DisplayName("Deveria retornar ERROR se não há entrada no banco com a chave dada")
        void shouldNotGetValue() {
            Value value  = Value.newBuilder().build();
            Key key = Key.newBuilder().build();

            value  = Value.newBuilder()
                    .setData(ByteString.copyFromUtf8("teste"))
                    .setTimestamp(12345)
                    .setVersion(1)
                    .build();

            key = Key.newBuilder().setKey("44513412351").build();
            ShowResponse showResponse = api.showCall(key);
            Assertions.assertEquals("ERROR", showResponse.getStatus());
        }



        @Nested
        @DisplayName("testes dos casos de del(k):(e,v')")
        class deleteTests {

            @Test
            @DisplayName("Deveria remover a entrada k-v' se ela existir, retornando SUCCESS e o valor " +
                    "da chave removida")
            void shouldDeleteValue() {

            }

            @Test
            @DisplayName("Deveria retornar ERROR e um valor nulo, se não existe entrada no banco com a dada chave")
            void shouldNotDeleteValue() {

            }


        }

        @Nested
        @DisplayName("testes dos casos de del(k,vers):(e,v')")
        class deleteByVersionTests {
            @Test
            @DisplayName("Deveria remover a entrada k-v'se ela existir e tiver a versão específicada, retornando " +
                    "retornando SUCCESS e a chave removida")
            void shouldDeleteValue() {


            }

            @Test
            @DisplayName("Deveria retornar ERROR_NE e valor NULL se não existe entrada com a chave especificada" +
                    " no banco de dados ")
            void shoulNotdDeleteValue() {


            }

            @Test
            @DisplayName("Deveria retornar ERROR_WV e valor NULL se existe uma entrada com a chave especificada" +
                    " no banco de dados mas ela não tem a versão requisitada")
            void shoulNotdDeleteValue2() {
            }
        }

        @Nested
        @DisplayName("testes dos casos de testAndSet(k,v,vers):(e,v')")
        class testAndSetTests {
            @Test
            @DisplayName("Deveria retornar SUCCESS e o valor da chave " +
                    ", indicando que a chave no mapa existia e teve seu valor atualizado")
            void shouldTestAndSet() {


            }

            @Test
            @DisplayName("Deveria retornar ERROR_NE se o valor da chave " +
                    "não exisitia no banco de dados")
            void shouldNotTestAndSet() {


            }

            @Test
            @DisplayName("Deveria retornar ERROR_WV se o valor da chave " +
                    "já existia no banco de dados mas sem a ver")
            void shouldNotTestAndSet2() {


            }





        }



    }
}
