import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "17", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "a16"}
        };

        String[][] array2 = generateRandomArray(4, 4);
        String[][] array3 = generateRandomArray(3, 5);

        try {
            int sum = processArray(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            int sum = processArray(array2);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            int sum = processArray(array3);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String[][] generateRandomArray(int rows, int columns) {
        String[][] array = new String[rows][columns];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = String.valueOf(random.nextInt(10));
            }
        }

        return array;
    }

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4 у вас "+array.length+"x"+array[0].length+"",array.length, array[0].length);
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке: "+ i +" x "+j+"", i, j);
                }
            }
        }

        return sum;
    }
}