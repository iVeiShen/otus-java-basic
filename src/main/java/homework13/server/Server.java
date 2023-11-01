package homework13.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

public class Server {

    private ServerSocket server;
    private Socket client;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    private String data;
    private Float result;

    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started");
            server = serverSocket;
            client = server.accept();
            dataInputStream = new DataInputStream(client.getInputStream());
            dataOutputStream = new DataOutputStream(client.getOutputStream());
            System.out.println("Client connected to server");
            while (!client.isClosed()) {
                getDataFromClient();
                calculate();
                sendDataToClient();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getDataFromClient() {
        System.out.println("Start getting data from client:");
        try {
            data = dataInputStream.readUTF();
            System.out.println("data: " + data);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        System.out.println("--> End getting data from client:");
    }

    private void calculate() {
        System.out.println("Start calculating:");
        List<String> dataValues = Arrays.asList(data.split(","));
        switch (dataValues.get(2)) {
            case "+":
                result = Float.parseFloat(dataValues.get(0)) + Float.parseFloat(dataValues.get(1));
                break;
            case "-":
                result = Float.parseFloat(dataValues.get(0)) - Float.parseFloat(dataValues.get(1));
                break;
            case "*":
                result = Float.parseFloat(dataValues.get(0)) * Float.parseFloat(dataValues.get(1));
                break;
            case "/":
                result = Float.parseFloat(dataValues.get(0)) / Float.parseFloat(dataValues.get(1));
                break;
        }
        System.out.println("result: " + result);
        System.out.println("--> End calculating");
    }

    private void sendDataToClient() {
        if (result != null) {
            try {
                System.out.println("Start sending data to client:");
                dataOutputStream.writeUTF(result.toString());
                dataOutputStream.flush();
                System.out.println("--> End sending data to client");
            } catch (IOException e) {
                e.printStackTrace();
            }
            result = null;
            data = null;
        }
    }
}
