public class MyArrayDataException extends MyArrayExeptions {
    /**
     * Исключение показывающие координаты неправильного символа
     * @param message сообщение
     * @param row ряд
     * @param column столбец
     */
    public MyArrayDataException(String message,int row, int column) {
        super(message, row, column);
    }
}