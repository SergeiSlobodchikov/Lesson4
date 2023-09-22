public class MyArrayExeptions extends Exception{

    private final int a;
    private final int b;
    public MyArrayExeptions(String message,int a, int b) {
        super(message);
        this.a = a;
        this.b = b;
    }
}
