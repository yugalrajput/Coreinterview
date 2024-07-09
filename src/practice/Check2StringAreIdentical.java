package practice;

//Q5. Find out whether two strings are identical or not ?
// don't compare by word, compare character by character ?

public class Check2StringAreIdentical {
    public static boolean checkIdentical(String s1, String s2) {
        //yha p check kia h string k length same h k nhi
        if (s1.length() != s2.length()) {
            return false;
        }
        //yha p character check kia h one by one
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;//yha p kuch b galat mila to false ho jaye
            }
        }
        //yha p sab character match ho to true ho jaye
        return true;
    }

    public static void main(String[] args) {
        String s1 = "Hello Yugal";
        String s2 = "Hello Yugal";

        boolean areIdentical = checkIdentical(s1, s2);

        if (areIdentical) {
            System.out.println("The String are Identical");
        } else {
            System.out.println("The String are NotIdentical");
        }
    }
}
