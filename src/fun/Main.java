package fun;

public class Main extends Thread{
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    @Override
    public void run(){
        Host host = new Host("172.25.135.166", 12345);
        Client client = new Client(host.getAddress(), host.getPort());
    }
}