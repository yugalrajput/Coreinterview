package exception;

public class UnCheckedException {
    public static void main(String[] args) {
        int i =10;
        if (i != 10){
            System.out.println("i 10 nhi h");
        }else {
            RuntimeException r = new RuntimeException("Wrong no h");
            throw  r;
        }
    }
}
