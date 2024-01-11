package exception;

public class SingleCatchMultiException {
    public static void main(String[] args) {
        String s = "YUGAL";
        try {
            System.out.println(s.charAt(6));
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("ab dekho aiii exception");

    }
}
