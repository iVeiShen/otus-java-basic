package homework13.client;

public class ClientApp {
    public static void main(String[] args) {
        System.out.println("Client-Server app \"Calculator\":");
        Client client = new Client();
        client.startClient("localhost", 8080);
    }
}
