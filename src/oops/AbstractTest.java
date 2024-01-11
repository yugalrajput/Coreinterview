package oops;

public class AbstractTest extends AbstractExample {


    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AbstractTest t = new AbstractTest();
        int sum = t.add(10, 20);
        System.out.println(sum);

    }
}
