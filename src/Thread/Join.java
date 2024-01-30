package Thread;

public class Join extends Thread {

    public Join(String name) {
        super(name);
    }

    @Override
    public void run() {
        //String name = currentThread().getName();
        System.out.println(getName());

        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // System.out.println("Child Thread = " + name);

    }

    public static void main(String[] args) {
        Join j1 = new Join("YUGAL");
        Join j2 = new Join("RAJPUT");
        Join j3 = new Join("AMAN");

        // j1.setName("Thread 1");
        // j2.setName("Thread 2");
        // j3.setName("Thread 3");


        j2.start();

        try {
            j2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j1.start();
        j3.start();

    }
}
