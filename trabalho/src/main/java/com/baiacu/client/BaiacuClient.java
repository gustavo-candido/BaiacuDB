package com.baiacu.client;

import com.google.protobuf.ByteString;
import com.proto.baiacu.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class BaiacuClient {

    public static void main(String[] args) {


        ApiCalls apiCalls = new ApiCalls();
        int chosenCall = 0;
        Scanner scanchoice = new Scanner(System.in);

        while(chosenCall != 6){
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
                    apiCalls.StoreCall();
                    break;
                case 2:
                    apiCalls.showCall();
                    break;
                case 6:
                    System.exit(0);
            }

        }
    }
}
