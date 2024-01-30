package Thread;

public class TestRunnable implements Runnable {

    public String name;

    public TestRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println(i + " " + name);
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestRunnable("YUGAL"));
        Thread t2 = new Thread(new TestRunnable("RAJPUT"));

        t1.start();
        t2.start();
    }
}
