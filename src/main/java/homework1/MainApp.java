package homework1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер метода (от 1 до 5):");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Метод greetings:");
            greetings();
        } else if (n == 2) {
            System.out.println("Метод checkSign:");
            int min = -100;
            int max = 100;
            int a = min + (int) (Math.random() * (max - min + 1));
            int b = min + (int) (Math.random() * (max - min + 1));
            int c = min + (int) (Math.random() * (max - min + 1));
            System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
            checkSign(a, b, c);
        } else if (n == 3) {
            System.out.println("Метод selectColor:");
            int min = 0;
            int max = 30;
            int data = min + (int) (Math.random() * (max - min + 1));
            System.out.println("data = " + data);
            selectColor(data);
        } else if (n == 4) {
            System.out.println("Метод compareNumbers:");
            int min = -10;
            int max = 10;
            int a = min + (int) (Math.random() * (max - min + 1));
            int b = min + (int) (Math.random() * (max - min + 1));
            System.out.println("a = " + a + "\nb = " + b);
            compareNumbers(a, b);
        } else if (n == 5) {
            System.out.println("Метод compareNumbers:");
            int initValue = (int) (Math.random() * 100);
            int delta = (int) (Math.random() * 100);
            boolean increment = Math.random() > 0.5;
            System.out.println("initValue = " + initValue + "\ndelta = " + delta + "\nincrement = " + increment);
            addOrSubtractAndPrint(initValue, delta, increment);
        } else {
            System.out.println("Нет метода, соответствующего введенному значению!");
        }
    }

    public static void greetings() {
        System.out.println("Hello" + "\nWorld" + "\nfrom" + "\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sign = a + b + c;
        if (sign >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int res;
        if (increment) {
            res = initValue + delta;
            System.out.println(res);
        } else {
            res = initValue - delta;
            System.out.println(res);
        }
    }
}