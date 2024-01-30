package Thread;

public class DaemonThread extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("daemon thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        DaemonThread d = new DaemonThread();
        d.setDaemon(true);
       // d.start();


        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main thread" + i);
        }
        System.out.println("Leaving main method");
        System.out.println("Now JVM will exit");
    }


}
