package exception;

public class TryWithFinally {
    public static void main(String[] args) {
        String name = "YUGAL";
        try {
            name.charAt(6);
            System.out.println("dekho 6 h k nhi");
            System.exit(0);
        } finally {
            System.out.println("ye to har bar chlegaa");
        }


    }
}
