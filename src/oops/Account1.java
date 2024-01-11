package oops;

public class Account1 {

    public int balance ;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public int deposit(int amt) {
        balance = balance+amt;
        System.out.println("Total Balance" +balance);
        return balance;

    }

    public void withdrawl(int amt) {
        balance =balance-amt;
        if (balance <=2000) {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[]args) {
        Account1 a = new Account1();
        a.setBalance(10000);
        a.withdrawl(8000);
        System.out.println(a.getBalance());
    }

}

