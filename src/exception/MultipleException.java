package exception;

public class MultipleException {
    public static void main(String[] args) {
        //  String name= null;
        String name = "YUGAL";
        try {
             System.out.println(name.charAt(5));
            System.out.println(name.length());

        } catch (NullPointerException e) {
            System.out.println("name khali h");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String 5 nhi 4 word ka h");
        }
    }
}
