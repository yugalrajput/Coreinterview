package Thread;

public class Join extends Thread {
    @Override
    public void run() {
        String name = currentThread().getName();
        for (int i = 0; i < 3; i++) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Join j1 = new Join();
        Join j2 = new Join();
        Join j3 = new Join();

        j1.setName("Thread 1");
        j2.setName("Thread 2");
        j3.setName("Thread 3");

        j1.start();
        j2.start();

        try {
            j2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j3.start();

    }
}
