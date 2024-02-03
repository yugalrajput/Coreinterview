package Thread;

public class TestThread extends Thread {
    public String name;

    public TestThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println(i + "  " + name);
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("YUGAL");
        TestThread t2 = new TestThread("RAJPUT");

        t1.start();
        t2.start();
    }
}
