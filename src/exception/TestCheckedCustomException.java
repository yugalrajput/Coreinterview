package exception;

public class TestCheckedCustomException {
    public static void main(String[] args) {
        dad();
    }

    public static void dad() {
        try {
            mom();
        } catch (CheckedCustomException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void mom() throws CheckedCustomException {

        son();


    }

    public static void son() throws CheckedCustomException {
        throw new CheckedCustomException();
    }
}
