package collection;

import java.util.Stack;

public class StackHolding {
    public static void main(String[] args) {
        Stack s = new Stack();

        for (char i = 'a'; i <= 'z'; i++) {

            System.out.print(s.push(i) + " ");

        }
        System.out.println();

        Stack s1 = new Stack();
        while (!s1.isEmpty()) {
            System.out.println(s1.push(s.pop()) + " ");
        }
        System.out.println();

        while (!s1.isEmpty()) {
            System.out.println(s.push(s1.pop()) + " ");
        }
    }
}
