package homework8;

import java.util.Arrays;

public class HomeWork8App {
    public static void main(String[] args) {
        String[][] array1 = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}};
        String[][] array2 = {{"1", "1", "1", "1"}, {"2L", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][] array3 = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            System.out.println(checkArray(array3));
        } catch (AppArraySizeException appArraySizeException) {
            System.out.println("ERROR: appArraySizeException");
        } catch (AppArrayDataException appArrayDataException) {
            System.out.println("Неверное значение! Строка - " + appArrayDataException.getRow() + " Колонка - " + appArrayDataException.getColumn());
        }
    }

    public static int checkArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        int result = 0;
        System.out.println("Входящий массив: " + Arrays.deepToString(array));
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        return result;
    }
}
