package com.baiacu.client2;

import com.google.protobuf.ByteString;
import com.proto.baiacu.DestroyByVersionResponse;
import com.proto.baiacu.Key;
import com.proto.baiacu.ShowResponse;
import com.proto.baiacu.StoreResponse;
import com.proto.baiacu.TestAndSetResponse;
import com.proto.baiacu.Value;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiacuClient2 {
    public static void main(String[] args) {

        int chosenCall = 0;
        Scanner scanchoice = new Scanner(System.in);
        while(chosenCall != 6){
            System.out.println("Bem vindo ao terminal de cliente do Baiacu");
            System.out.println("1- Requisição de store");
            System.out.println("2- Requisição de Show");
            System.out.println("3- Requisição de Destroy");
            System.out.println("3- Requisição de DestroyByVersion");
            System.out.println("4- Requisição de testAbdSet");
            System.out.println("6- Sair");

            if(scanchoice.hasNextInt())
                chosenCall = scanchoice.nextInt();

            switch(chosenCall){
                case 1:
                    storeHandler();
                    break;
                case 2:
                    showHandler();
                    break;
                case 3:
                    destroyHandler();
                case 4:
                    destroyByVersionHandler();
                case 5:
                    testAndSetHandler();
                case 6:
                    System.exit(0);
            }
        }
    }

    private static void destroyHandler() {
        APICalls apiCalls = new APICalls();
        Scanner scanchoice = new Scanner(System.in);
        String keyString;

        do {
            System.out.println("Escreva a chave que você quer observar o dado:");
            keyString = scanchoice.nextLine();
        }
        while(!onlyDigits(keyString));

        Key key = Key.newBuilder().setKey(keyString).build();

        ShowResponse response = apiCalls.showCall(key);
        System.out.println(response);
    }

    private static void destroyByVersionHandler() {
        APICalls apiCalls = new APICalls();
        Scanner scanchoice = new Scanner(System.in);
        String keyString;

        do {
            System.out.println("Escreva a chave que você quer observar o dado:");
            keyString = scanchoice.nextLine();
        }
        while(!onlyDigits(keyString));

        System.out.println("Escreva a versão do dado que você quer destruir:");
        int version = scanchoice.nextInt();

        Key key = Key.newBuilder().setKey(keyString).build();

        DestroyByVersionResponse response = apiCalls.destroyByVersionCall(key,version);
        System.out.println(response);
    }


    private static void showHandler() {
        APICalls apiCalls = new APICalls();
        Scanner scanchoice = new Scanner(System.in);
        String keyString;

        do {
            System.out.println("Escreva a chave que você quer observar o dado:");
            keyString = scanchoice.nextLine();
        }
        while(!onlyDigits(keyString));

        Key key = Key.newBuilder().setKey(keyString).build();

        ShowResponse response = apiCalls.showCall(key);
        System.out.println(response);
    }

    private static void testAndSetHandler() {
        APICalls apiCalls = new APICalls();
        Scanner scanchoice = new Scanner(System.in);
        String keyString;

        do {
            System.out.println("Escreva a chave que armazenará seu dado:");
            keyString = scanchoice.nextLine();
        }
        while(!onlyDigits(keyString));

        Key key = Key.newBuilder().setKey(keyString).build();

        System.out.println("Escreva o dado que você quer amrazenar:");
        String data = scanchoice.nextLine();

        System.out.println("Escreva a versão do dado que você quer destruir:");
        int version = scanchoice.nextInt();

        Value value = Value.newBuilder()
                .setData(ByteString.copyFromUtf8(data))
                .setTimestamp(System.currentTimeMillis() / 1000L)
                .build();

        TestAndSetResponse response = apiCalls.testAndSetCall(key, value, version);
        System.out.println(response);
    }

    private static void storeHandler(){
        APICalls apiCalls = new APICalls();
        Scanner scanchoice = new Scanner(System.in);
        String keyString;

        do {
            System.out.println("Escreva a chave que armazenará seu dado:");
            keyString = scanchoice.nextLine();
        }
        while(!onlyDigits(keyString));

        Key key = Key.newBuilder().setKey(keyString).build();

        System.out.println("Escreva o dado que você quer amrazenar:");
        String data = scanchoice.nextLine();

        Value value = Value.newBuilder()
                .setData(ByteString.copyFromUtf8(data))
                .setTimestamp(System.currentTimeMillis() / 1000L)
                .build();

        StoreResponse response = apiCalls.storeCall(key, value);
        System.out.println(response);
    }



    private static boolean onlyDigits(String str)
    {
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);
        return m.matches();
    }
}
