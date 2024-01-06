package lk.ijse;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(3000);


        Socket socket = serverSocket.accept();

        System.out.println("Accepted");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String massage=dataInputStream.readUTF();
        System.out.println("Server :" +massage);

            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}