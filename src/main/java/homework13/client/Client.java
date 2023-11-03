package homework13.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    private String data;

    public void startClient(String proxy, Integer port) {
        try (Socket socketServer = new Socket(proxy, port)) {
            socket = socketServer;
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("Client connected to server: " + proxy + ":" + port);
            while (!socket.isOutputShutdown()) {
                if (data == null) {
                    getDataFromUser();
                    sendDataToServer();
                    getDataFromServer();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        String inputData;
        String value1 = null;
        String value2 = null;
        String operation = null;
        while (data == null) {
            while (value1 == null) {
                System.out.println("Введите первое число:");
                inputData = scanner.nextLine();
                try {
                    Float.parseFloat(inputData);
                    value1 = inputData;
                } catch (NumberFormatException e) {
                    System.out.println("Неверное число!");
                }
            }
            while (value2 == null) {
                System.out.println("Введите второе число:");
                inputData = scanner.nextLine();
                try {
                    Float.parseFloat(inputData);
                    value2 = inputData;
                } catch (NumberFormatException e) {
                    System.out.println("Неверное число!");
                }
            }
            while (operation == null) {
                System.out.println("Введите операцию (+ - * /):");
                inputData = scanner.nextLine();
                if (List.of("+", "-", "*", "/").contains(inputData)) {
                    operation = inputData;
                } else {
                    System.out.println("Неверная операция!");
                }
                data = value1 + "," + value2 + "," + operation;
            }
        }

    }

    private void sendDataToServer() {
        System.out.println("Sending data to server:");
        try {
            System.out.println(data);
            dataOutputStream.writeUTF(data);
            dataOutputStream.flush();
            System.out.println("--> Data successfully sent to server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getDataFromServer() {
        System.out.println("Start getting data from server:");
        try {
            System.out.println("result: " + dataInputStream.readUTF());
            data = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("--> End getting data from server:");

    }
}
