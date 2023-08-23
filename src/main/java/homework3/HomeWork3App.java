package homework3;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class HomeWork3App {
    public static void main(String[] args) {
        System.out.println("1. sumOfPositiveElements:");
        int[][] arrayForPositive = {{1, -1}, {5, -7}};
        System.out.println("Array:");
        printArray2D(arrayForPositive);
        int sumPositive = sumOfPositiveElements(arrayForPositive);
        System.out.println("sumPositive = " + sumPositive);
        System.out.println("2. printSquareBySize:");
        printSquareBySize(5);
        System.out.println("3. resetDiagonal:");
        int[][] arrayForDiagonal = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        System.out.println("Array before:");
        printArray2D(arrayForDiagonal);
        resetDiagonal(arrayForDiagonal);
        System.out.println("Array after:");
        printArray2D(arrayForDiagonal);
        System.out.println("4. findMax:");
        int[][] arrayForFindMax = {{1, 2, 3, 4}, {5, 6, 1, 7, 2}};
        System.out.println("Array:");
        printArray2D(arrayForFindMax);
        int max = findMax(arrayForFindMax);
        System.out.println("max = " + max);
        System.out.println("5. getSumForSecondRow:");
        int[][] arrayForSecondRow = {{1, 2, 3}, {3, 2, 1}};
        System.out.println("Array for getSumForSecondRow:");
        printArray2D(arrayForSecondRow);
        int sumSecondRow = getSumForSecondRow(arrayForSecondRow);
        System.out.println("sumForSecondRow = " + sumSecondRow);
    }

    public static void printArray2D(int[][] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
                if (array[i][j] > 0) {
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquareBySize(int size) {
        System.out.println("Size = " + size);
        String[][] square = new String[size][size];
        for (int i = 0; i < square.length; i = i + 1) {
            for (int j = 0; j < square[i].length; j = j + 1) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void resetDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
                if (i == 0 && j == 0) {
                    array[i][j] = 0;
                }
                if (i == 1 && j == array[i].length / 2) {
                    array[i][j] = 0;
                }
                if (i == array.length - 1 && j == array[i].length - 1) {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    private static int getSumForSecondRow(int[][] array) {
        int sum = 0;
        if (array.length < 2) {
            sum = -1;
        } else {
            for (int i = 0; i < array[1].length; i = i + 1) {
                sum = sum + array[1][i];
            }
        }
        return sum;
    }
}
