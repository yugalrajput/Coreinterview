package collection;

public class EqualHashCodeTest {
    public static void main(String[] args) {
        EqualHashCode e = new EqualHashCode(100,"Yugal","500");
        EqualHashCode e1 = new EqualHashCode(100,"Yugal","500");

        if (e.equals(e1)){
            if (e.hashCode()==e1.hashCode()){
                System.out.println("Equals");
            }
        }else {
            System.out.println("Not Equals");
        }
    }
}
