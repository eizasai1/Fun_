package fun;

import java.net.*;
import java.io.*;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader bufferedReader;
    private DataInputStream input;
    private DataOutputStream output;
    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            input = new DataInputStream(clientSocket.getInputStream());
            bufferedReader = new BufferedReader(new InputStreamReader(input));
            output = new DataOutputStream(clientSocket.getOutputStream());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getHostAddress() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        }
        catch (IOException e) {
            throw new RuntimeException("error getting host");
        }
    }

    public static void main(String[] args) {
        Server server = new Server(12345);
        System.out.println(Server.getHostAddress());
    }
}
