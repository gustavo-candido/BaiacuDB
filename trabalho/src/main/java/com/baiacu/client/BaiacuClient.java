package com.baiacu.client;

import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.Value;

import java.util.Scanner;

public class BaiacuClient {

    public static void main(String[] args) {


        APICalls apiCalls = new APICalls();
        int chosenCall = 0;
        Scanner scanchoice = new Scanner(System.in);


        while(chosenCall != 6){
            Value value  = Value.newBuilder().build();
            Key key = Key.newBuilder().build();

            System.out.println("Bem vindo ao terminal de cliente do Baiacu");
            System.out.println("1- Requisição de store");
            System.out.println("2- Requisição de Show");
            System.out.println("3- Requisição de DestroyByVersion");
            System.out.println("4- Requisição de testAbdSet");
            System.out.println("6- Sair");

            if(scanchoice.hasNextInt())
                chosenCall = scanchoice.nextInt();

            switch(chosenCall){
                case 1:
                     value  = Value.newBuilder() // versão é setada apenas pelo servidor
                            .setData(ByteString.copyFromUtf8("testreee carai"))
                            .setTimestamp(12345)
                            .build();

                     key = Key.newBuilder().setKey("123456789").build();
                    apiCalls.storeCall(key,value);
                    break;
                case 2:
                     key = Key.newBuilder().setKey("123456789").build();
                    apiCalls.showCall(key);
                    break;
                case 6:
                    System.exit(0);
            }

        }
    }
}
