package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2App {
    public static void main(String[] args) {
        System.out.println("1. printMessageNTimes:");
        printMessageNTimes(5, "Нормальная практика в Репозитории сразу возвращать дто или правильный путь = репозиторий - класс - маппер - дто?");

        System.out.println("2. getSumFor5:");
        int[] array = {0, 6, 8, 5, 2, 2};
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
        getSumFor5(array);

        System.out.println("3. fillArrayByNumber");
        System.out.println("fillNumber = " + 999);
        fillArrayByNumber(999, array);
        System.out.println("Array after:");
        System.out.println(Arrays.toString(array));

        System.out.println("4. increaseArrayByNumber");
        System.out.println("increaseNumber: " + 1);
        increaseArrayByNumber(1, array);
        System.out.println("Array after:");
        System.out.println(Arrays.toString(array));

        System.out.println("5. compareArrayParts:");
        int[] arrayForCompare = {1, 2, 3, 3, 2, 0};
        System.out.println("ArrayForCompare:");
        System.out.println(Arrays.toString(arrayForCompare));
        compareArrayParts(arrayForCompare);

        System.out.println("6. sumArray");
        int[] arrayForSum1 = {1, 2};
        int[] arrayForSum2 = {1, 2, 3};
        int[] arrayForSum3 = {1, 0};
        System.out.println("Array1: " + Arrays.toString(arrayForSum1));
        System.out.println("Array2: " + Arrays.toString(arrayForSum2));
        System.out.println("Array3: " + Arrays.toString(arrayForSum3));
        sumArray(arrayForSum1, arrayForSum2, arrayForSum3);

        System.out.println("7. checkCenterDot:");
        int[] arrayForCenterDot = {1, 2, 3, -1, 2, 3};
        System.out.println("Array: " + Arrays.toString(arrayForCenterDot));
        checkCenterDot(arrayForCenterDot);

        System.out.println("8. checkArrayOrder:");
        int[] arrayForOrder = {5, 3, 0};
        System.out.println("Array: " + Arrays.toString(arrayForOrder));
        checkArrayOrder(arrayForOrder);

        System.out.println("9. upendArray:");
        int[] arrayForUpend = {1, 2, 3, 4};
        System.out.println("Array: " + Arrays.toString(arrayForUpend));
        upendArray(arrayForUpend);
    }

    public static void printMessageNTimes(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void getSumFor5(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                res += array[i];
            }
        }
        System.out.println("sum for >5: " + res);
    }

    public static void fillArrayByNumber(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    public static void increaseArrayByNumber(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
    }

    public static void compareArrayParts(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= Math.round(array.length / 2 - 1)) {
                sum1 += array[i];
            } else {
                sum2 += array[i];
            }
        }
        if (sum1 > sum2) {
            System.out.println("1(сумма = " + sum1 + ") > 2(сумма = " + sum2 + ")");
        } else if (sum1 < sum2) {
            System.out.println("1(сумма = " + sum1 + ") < 2(сумма = " + sum2 + ")");
        } else if (sum1 == sum2) {
            System.out.println("1(сумма = " + sum1 + ") = 2(сумма = " + sum2 + ")");
        }
    }

    public static void sumArray(int[] array1, int[] array2, int[] array3) {
        int[] sumArray = new int[Math.max(array1.length, Math.max(array2.length, array3.length))];
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sumArray[i] += array2[i];
        }
        for (int i = 0; i < array3.length; i++) {
            sumArray[i] += array3[i];
        }
        System.out.println(Arrays.toString(sumArray));
    }

    private static void checkCenterDot(int[] array) {
        int sum = 0;
        int tempSum = 0;
        boolean haveDot = false;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length - 1; i++) {
            tempSum += array[i];
            if (tempSum == sum / 2) {
                haveDot = true;
                break;
            }
        }
        System.out.println(haveDot);
    }

    private static void checkArrayOrder(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите направление проверки (1 - возврастание; 0 - убывание)");
        int n = scanner.nextInt();
        boolean checkArray = true;
        if (n == 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] >= array[i + 1]) {
                    checkArray = false;
                    break;
                }
            }
        } else if (n == 0) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    checkArray = false;
                    break;
                }
            }
        }
        System.out.println(checkArray);
    }

    public static void upendArray(int[] array) {
        int tempValue;
        for (int i = 0; i < array.length / 2; i++) {
            tempValue = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = tempValue;
        }
        System.out.println(Arrays.toString(array));
    }
}