package Thread;

public class Account {
    private double balance;

    public void setBalance(double balance) {
        delay();
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // sorting order m amount lana ho to
    // public synchronized void deposit kr do
    //method synchronized
    public synchronized void deposit(String msg, double amt) {
        //block synchronized
        // synchronized (this) {
        double bal = getBalance() + amt;
        setBalance(bal);
        System.out.println(msg + " -> new balance =" + bal);
        // }
    }

    public void delay() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
