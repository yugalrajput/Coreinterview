package exception;

public class NumberFormatException {
    public static void main(String[] args) {
        String name = "YUGAL";
        try {
            int i = Integer.parseInt(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("dekho aa gai");
    }
}
