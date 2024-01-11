package oops;

public class AbstractInterfaceTest implements AbstractInterface {


    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AbstractInterfaceTest a = new AbstractInterfaceTest();
        int i = a.sum(10, 20);
        System.out.println("Value is = " + i);


    }
}
