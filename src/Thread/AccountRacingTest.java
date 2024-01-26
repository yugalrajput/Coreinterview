package Thread;

public class AccountRacingTest {
    public static void main(String[] args) {
        AccountRacing r = new AccountRacing("YUGAL");
        AccountRacing r1 = new AccountRacing("RAJPUT");

        r.start();
        r1.start();
    }
}
