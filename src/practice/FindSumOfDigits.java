package practice;

//Q2. “ab12pq34” Find sum of digits in this string using java 8 Streams ?

public class FindSumOfDigits {

    //using java8 stream
    public static void main(String[] args) {
        String s = "ab12cd45";
        int sum = s.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);


        //using core java

        int sum1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                sum1 += Character.getNumericValue(c);
            }
        }

        System.out.println(sum1);


    }
}
