package oops;

public class Account {
    public double balance;

    public Account(double amount) {
        this.balance = amount;
    }


    public void deposit(int amt) {
        System.out.println("total balance" + balance);
        System.out.println("total deposit" + amt);
        balance = balance + amt;
        System.out.println("Total balance after deposit" + balance);
    }

    public void withdrawal(int amt) {
        System.out.println("Total balance" + balance);
        System.out.println("total withdrawal" + " = " + amt);
        balance = balance - amt;
        if (balance <= 2000) {
            System.out.println("Insufficient balance" + " = " + balance);
        }

        //System.out.println("Total balance after withdrawal" + balance);

    }

    public static void main(String[] args) {
        Account a = new Account(10000);
        a.deposit(5000);
        a.withdrawal(13000);
    }
}
