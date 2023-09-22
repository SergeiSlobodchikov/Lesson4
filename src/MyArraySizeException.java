public class MyArraySizeException extends MyArrayExeptions{

    /**
     * Исключение показывающие размер таблицы
     * @param message сообщение
     * @param rows ряд
     * @param columns столбец
     */
    public MyArraySizeException(String message, int rows, int columns) {
        super(message, rows, columns);
    }
}