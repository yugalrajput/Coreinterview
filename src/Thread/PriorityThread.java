package Thread;

public class PriorityThread extends Thread{
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println(getName() + " -> PR  " + getPriority());
        }
    }

    public static void main(String[] args) {
        PriorityThread t = new PriorityThread("YUGAL");
        PriorityThread t1 = new PriorityThread("RAJPUT");

        t.setPriority(1);
        t1.setPriority(10);
        t.start();
        t1.start();
    }
}
