import com.baiacu.client.APICalls;
import com.baiacu.clientAsync.APICallsAsync;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ByteString;
import com.proto.baiacu.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class APITests {
    private static APICalls api;
    private  static APICallsAsync apiAsync;
    private static List<KeyValue> StoredKeyArray = new ArrayList<>();

    private long UPMOST = 9999;

    APITests() {
        api = new APICalls();
        apiAsync = new APICallsAsync();
    }

    @AfterAll
    static void cleanUp(){
        for (KeyValue kv : StoredKeyArray){
            System.out.println(api.destroyCall(kv.getKey()));
        }
    }


    private KeyValue generateAndStoreKV(long min){
        boolean remakeKey = false;
        long keyString;

        do {
            remakeKey = false;
            keyString = new Random().nextInt(999999) + min;
            for (KeyValue kv : StoredKeyArray) {
                if (kv.getKey().getKey().equals(String.valueOf(keyString))) {
                    remakeKey = true;
                }
            }
        } while (remakeKey);
        Key key = Key.newBuilder().setKey(String.valueOf(keyString)).build();

        Value value = Value.newBuilder()
                    .setData(ByteString.copyFromUtf8("teste"))
                    .setTimestamp(System.currentTimeMillis() / 1000L)
                    .setVersion(1)
                    .build();

            KeyValue keyValue = KeyValue.newBuilder()
                    .setKey(key)
                    .setValue(value)
                    .build();



        StoredKeyArray.add(keyValue);
        return keyValue;
    }
    @Nested
    @DisplayName("testes unicamente de cada chamada")
    class SingleTests {
        @Nested
        @DisplayName("testes dos casos de set(k,ts,d):(e,v')")
        class StoreTests {
            @Test
            @DisplayName("Deveria retornar SUCCESS ao guardar valor")
            void shouldStoreValue() {
                KeyValue kv = generateAndStoreKV(1);
                StoreResponse response = api.storeCall(kv.getKey(),kv.getValue());
                Assertions.assertEquals("SUCCESS", response.getStatus());
            }

            @Test
            @DisplayName("Deveria retornar ERROR ao guardar valor igual ao que já existe naquela chave")
            void shouldErrorInStoreValue() {
                KeyValue kv = generateAndStoreKV(1);
                api.storeCall(kv.getKey(),kv.getValue());
                StoreResponse responseAgain = api.storeCall(kv.getKey(),kv.getValue());
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
                KeyValue kv = generateAndStoreKV(1);
                StoreResponse storeResponse = api.storeCall(kv.getKey(),kv.getValue());
                Assertions.assertEquals("SUCCESS", storeResponse.getStatus());
                ShowResponse showResponse = api.showCall(kv.getKey());
                Assertions.assertEquals(kv.getValue(), showResponse.getValue());
                Assertions.assertNotNull(showResponse.getValue());
            }


            @Test
            @DisplayName("Deveria retornar ERROR se não há entrada no banco com a chave dada")
            void shouldNotGetValue() {
                KeyValue kv = generateAndStoreKV(1);
                ShowResponse showResponse = api.showCall(kv.getKey());
                Assertions.assertEquals("ERROR", showResponse.getStatus());
                Assertions.assertEquals(0,showResponse.getValue().getData().size());
            }

        }

        @Nested
        @DisplayName("testes dos casos de del(k):(e,v')")
        class deleteTests {

            @Test
            @DisplayName("Deveria remover a entrada k-v' se ela existir, retornando SUCCESS e o valor " +
                    "da chave removida")
            void shouldDeleteValue() {
                KeyValue kv = generateAndStoreKV(1);
                api.storeCall(kv.getKey(),kv.getValue());
                DestroyResponse destroyResponse = api.destroyCall(kv.getKey());
                Assertions.assertEquals("SUCCESS", destroyResponse.getStatus());
            }

            @Test
            @DisplayName("Deveria retornar ERROR e um valor nulo, se não existe entrada no banco com a dada chave")
            void shouldNotDeleteValue() {
                KeyValue kv = generateAndStoreKV(1);
                DestroyResponse destroyResponse =  api.destroyCall(kv.getKey());
                Assertions.assertEquals("ERROR", destroyResponse.getStatus());
            }
        }

        @Nested
        @DisplayName("testes dos casos de del(k,vers):(e,v')")
        class deleteByVersionTests {
            @Test
            @DisplayName("Deveria remover a entrada k-v'se ela existir e tiver a versão específicada, retornando " +
                    "retornando SUCCESS e a chave removida")
            void shouldDeleteValueByVersion() {
                KeyValue kv = generateAndStoreKV(1);
                api.storeCall(kv.getKey(),kv.getValue());
                DestroyByVersionResponse destroyResponse = api.destroyByVersionCall(kv.getKey(), kv.getValue().getVersion());
                Assertions.assertEquals("SUCCESS", destroyResponse.getStatus());
            }

            @Test
            @DisplayName("Deveria retornar ERROR_NE e valor NULL se não existe entrada com a chave especificada" +
                    " no banco de dados ")
            void shoulNotdDeleteValueByVersionNE() {
                KeyValue kv = generateAndStoreKV(1);
                DestroyByVersionResponse destroyResponse = api.destroyByVersionCall(kv.getKey(), kv.getValue().getVersion());
                Assertions.assertEquals("ERROR_NE", destroyResponse.getStatus());
            }

            @Test
            @DisplayName("Deveria retornar ERROR_WV e valor NULL se existe uma entrada com a chave especificada" +
                    " no banco de dados mas ela não tem a versão requisitada")
            void shoulNotdDeleteValueByVersionWV() {
                KeyValue kv = generateAndStoreKV(1);
                api.storeCall(kv.getKey(),kv.getValue());
                DestroyByVersionResponse d = api.destroyByVersionCall(kv.getKey(), kv.getValue().getVersion()-1);
                Assertions.assertEquals("ERROR_WV", d.getStatus());
            }
        }


        @Nested
        @DisplayName("testes dos casos de testAndSet(k,v,vers):(e,v')")
        class testAndSetTests {
            @Test
            @DisplayName("Deveria retornar SUCCESS e o valor da chave " +
                    ", indicando que a chave no mapa existia e teve seu valor atualizado")
            void shouldTestAndSet() {
                KeyValue kv = generateAndStoreKV(1);
                api.storeCall(kv.getKey(),kv.getValue());
                TestAndSetResponse t = api.testAndSetCall(kv.getKey(), kv.getValue(), kv.getValue().getVersion());
                Assertions.assertEquals("SUCCESS", t.getStatus());

            }

            @Test
            @DisplayName("Deveria retornar ERROR_NE se o valor da chave " +
                    "não exisitia no banco de dados")
            void shouldNotTestAndSetNE() {
                KeyValue kv = generateAndStoreKV(1);
                TestAndSetResponse t = api.testAndSetCall(kv.getKey(), kv.getValue(), kv.getValue().getVersion()+1);
                Assertions.assertEquals("ERROR_NE", t.getStatus());
            }

            @Test
            @DisplayName("Deveria retornar ERROR_WV se o valor da chave " +
                    "já existia no banco de dados mas sem a versão especificada")
            void shouldNotTestAndSet2WV() {
                KeyValue kv = generateAndStoreKV(1);
                api.storeCall(kv.getKey(),kv.getValue());
                TestAndSetResponse t = api.testAndSetCall(kv.getKey(), kv.getValue(), kv.getValue().getVersion()+1);
                Assertions.assertEquals("ERROR_WV", t.getStatus());
            }
        }
    }


    @Nested
    @DisplayName("testes de estresse")
    class StressTests {
        List<ListenableFuture<StoreResponse>> FutureStoreVec = new Vector<>();
        List<ListenableFuture<ShowResponse>> FutureShowVec = new Vector<>();
        List<ListenableFuture<TestAndSetResponse>> FutureTSVec = new Vector<>();


        //guarda primeiro 10 mil valores assíncronamente

        @Test
        @DisplayName("faz 10 mil inserções assíncronas e todas deveriam retornar sucesso")
        @Order(1)
        void StreesEnoughStore() throws ExecutionException, InterruptedException {
            for (int i = 1; i < 1000 ; i++) {
                KeyValue kv  = generateAndStoreKV(UPMOST);
                FutureStoreVec.add(apiAsync.storeCall(kv.getKey(),kv.getValue()));
            }

            for (ListenableFuture<StoreResponse> future : FutureStoreVec){
                Assertions.assertEquals("SUCCESS", future.get().getStatus());
            }
        }

        @DisplayName("faz 10 mil requisições de get assíncronas e todas deveriam retornar sucesso")
        void StreesEnoughGets() throws ExecutionException, InterruptedException {
            for (KeyValue kv : StoredKeyArray) {
                FutureShowVec.add(apiAsync.showCall(kv.getKey()));
            }

            for (ListenableFuture<ShowResponse> future : FutureShowVec){
                Assertions.assertEquals("SUCCESS", future.get().getStatus());
            }
        }


        @DisplayName("faz 10 mil gets no servidor")
        void StreesEnoughTestsAndSets() throws ExecutionException, InterruptedException {
            for (KeyValue kv : StoredKeyArray) {
                FutureTSVec.add(apiAsync.testAndSetCall(kv.getKey(),kv.getValue(), kv.getValue().getVersion()));
            }

            for (ListenableFuture<TestAndSetResponse> future : FutureTSVec){
                Assertions.assertEquals("SUCCESS", future.get().getStatus());
            }
        }
    }
}
