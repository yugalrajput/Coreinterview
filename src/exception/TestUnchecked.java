package exception;

public class TestUnchecked {
    public static void main(String[] args) {
        int i = 10;
        if (i != 10) {
            System.out.println("i not equal h");
        } else {
            RuntimeException r = new RuntimeException("wrong no");
            throw r;
        }
    }
}
