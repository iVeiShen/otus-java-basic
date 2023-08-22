package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2App {
    public static void main(String[] args) {
        printMessageNTimes(5, "Нормальная практика в Репозитории сразу возвращать дто или правильный путь = репозиторий - класс - маппер - дто?");
        int[] array = {0, 6, 8, 5, 2, 2};
        getSumFor5(array);

        fillArrayByNumber(999, array);

        increaseArrayByNumber(1, array);

        int[] arrayForCompare = {1, 2, 3, 3, 2, 0};
        compareArrayParts(arrayForCompare);

        int[] arrayForSum1 = {1, 2};
        int[] arrayForSum2 = {1, 2, 3};
        int[] arrayForSum3 = {1, 0};
        sumArray(arrayForSum1, arrayForSum2, arrayForSum3);

        int[] arrayForCenterDot = {1, 2, 3, -1, 2, 3};
        checkCenterDot(arrayForCenterDot);

        int[] arrayForOrder = {5, 3, 0};
        checkArrayOrder(arrayForOrder);

        int[] arrayForUpend = {1, 2, 3, 4};
        upendArray(arrayForUpend);

    }

    public static void printMessageNTimes(int n, String message) {
        for (int i = 0; i < n; i = i + 1) {
            System.out.println(message);
        }
    }

    public static void getSumFor5(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] > 5) {
                res = res + array[i];
            }
        }
        System.out.println(res);
    }

    public static void fillArrayByNumber(int value, int[] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void increaseArrayByNumber(int value, int[] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = array[i] + value;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void compareArrayParts(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            if (i <= Math.round(array.length / 2 - 1)) {
                sum1 = sum1 + array[i];
            } else {
                sum2 = sum2 + array[i];
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
        System.out.println(Arrays.toString(sumArray));
        for (int i = 0; i < sumArray.length; i = i + 1) {
            if (i + 1 <= array1.length) {
                sumArray[i] = sumArray[i] + array1[i];
            }
            if (i + 1 <= array2.length) {
                sumArray[i] = sumArray[i] + array2[i];
            }
            if (i + 1 <= array3.length) {
                sumArray[i] = sumArray[i] + array3[i];
            }
        }
        System.out.println(Arrays.toString(sumArray));
    }

    private static void checkCenterDot(int[] array) {
        int sum = 0;
        int tempSum = 0;
        boolean haveDot = false;
        for (int i = 0; i < array.length; i = i + 1) {
            sum = sum + array[i];
        }
        for (int i = 0; i < array.length; i = i + 1) {
            if (i == array.length - 1) {
                break;
            } else {
                tempSum = tempSum + array[i];
                if (tempSum == sum / 2) {
                    haveDot = true;
                }
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
            for (int i = 0; i < array.length; i = i + 1) {
                if (i + 1 < array.length && array[i] >= array[i + 1]) {
                    checkArray = false;
                }
            }
        } else if (n == 0) {
            for (int i = 0; i < array.length; i = i + 1) {
                if (i + 1 < array.length && array[i] <= array[i + 1]) {
                    checkArray = false;
                }
            }
        }
        System.out.println(checkArray);
    }

    public static void upendArray(int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = 0; i < tempArray.length; i = i + 1) {
            tempArray[i] = array[i];
        }
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = tempArray[tempArray.length - (i + 1)];
        }
        System.out.println(Arrays.toString(array));
    }

}