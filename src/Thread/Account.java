package Thread;

public class Account {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // sorting order m amount lana ho to
    // public synchronized void deposit kr do
    public void deposit(String msg, double amt) {
        double bal = getBalance() + amt;
        setBalance(bal);
        System.out.println(msg + " -> new balance =" + bal);
    }

    public void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
