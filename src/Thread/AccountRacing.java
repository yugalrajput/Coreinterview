package Thread;

public class AccountRacing extends Thread {
    public static Account a = new Account();

    public AccountRacing(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            a.deposit(getName(), 1000);
        }

    }


}
