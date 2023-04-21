package fun;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream output;
    public Client(String address, int port) {
        try {
            socket = new Socket(address, port);
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream((socket.getOutputStream()));
        }
        catch(IOException e) {
            throw new RuntimeException("error");
        }
    }
}
