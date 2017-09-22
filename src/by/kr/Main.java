package by.kr;

import by.kr.connection.ClientConnection;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        ClientConnection clientCon = new ClientConnection();
        try {
            clientCon.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
