package fun;

public class ClientThread extends Thread{
    @Override
    public void run(){
        Host host = new Host("172.25.135.166", 12345);
        Client client = new Client(host.getAddress(), host.getPort());
        client.communicationLoop();
    }
}
