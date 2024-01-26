package Thread;

public class DaemonThread extends Thread {
    public void run() {
        System.out.println("Daemon T Started" + currentThread().isDaemon());

        // Infinite loop wake in every 500ms
        while (true) {
            try {
                Thread.sleep(3000);
                System.out.println("Daemon D: woke up Again");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        DaemonThread d = new DaemonThread();
        d.setDaemon(true);
        d.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Leaving main method");
        System.out.println("Now JVM will exit");
    }


}
