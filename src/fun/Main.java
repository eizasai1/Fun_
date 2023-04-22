package fun;

public class Main extends Thread{
    public static void main(String[] args) {
        ClientThread clientThread = new ClientThread();
        clientThread.start();
        System.out.println("Hello world!");
    }
}