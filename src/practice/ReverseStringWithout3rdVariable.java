package practice;

import java.util.Scanner;

//Q3. Write a program to reverse a string  without using a third variable ?

public class ReverseStringWithout3rdVariable {
    public static void main(String[] args) {

        //Reverse String Using for loop

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        s = sc.nextLine();
        System.out.println("After reverse string is : ");
        for (int i = s.length(); i > 0; --i) {
            System.out.println(s.charAt(i - 1));
        }


        //using while loop

        String str;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the String : ");
        str = sc1.nextLine();
        System.out.println("After reverse string is : ");
        int i = str.length();
        while (i > 0) {
            System.out.println(str.charAt(i - 1));
            i--;
        }


    }


}

