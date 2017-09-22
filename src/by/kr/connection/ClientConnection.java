package by.kr.connection;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientConnection {
    private Socket socket = null;
    private BufferedReader in;
    private PrintWriter out;

    public void connect() throws IOException {
        System.out.println("Добро пожаловать на сторону клиента");
        System.out.println("Подключение... ");
        socket = new Socket(InetAddress.getByName("127.0.0.1"), 3332);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        //просто проверка, работает ли передача данных
        String d = in.readLine();
        System.out.println(d);
        out.println("Hi from client!");
    }
}
