package exception;

public class UnchackedExceptionPropogation {
    public static void main(String[] args) {
        dad();
    }

    private static void dad() {
        System.out.println("dad chli");
        try {
            mom();
        } catch (RuntimeException e) {
            System.out.println("dad method ko dekho");
        }
    }

    private static void mom() {
        System.out.println("mom chli");
        son();
    }

    private static void son() {
        System.out.println("son chli");
        throw new RuntimeException("mistak ho gai");
    }
}
