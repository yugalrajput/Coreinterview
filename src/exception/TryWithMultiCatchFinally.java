package exception;

public class TryWithMultiCatchFinally {
    public static void main(String[] args) {
        //String name = null;
        String name = "YUGAL";
        try {

            name.length();
            name.charAt(6);


        } catch (NullPointerException e) {

            System.exit(0);
            System.out.println("Value null h");
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("String k range jada likhi h");
            System.exit(0);
        } finally {
            System.out.println("ye to har bar chlegaa");
        }
    }
}
