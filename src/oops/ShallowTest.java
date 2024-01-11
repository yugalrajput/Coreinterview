package oops;

public class ShallowTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowClonee sc = new ShallowClonee();
        sc.rollNo=100;

        ShallowClonee sc1 = (ShallowClonee) sc.clone();
        sc1.rollNo=200;

        System.out.println(sc.getRollNo());
        System.out.println(sc1.getRollNo());

    }
}
