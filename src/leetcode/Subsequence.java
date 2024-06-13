package leetcode;

public class Subsequence {

    public static void main(String[] args) {

        String s = "coaching";
        String t = "coding";


        int i = 0, prefix = 0;
        int a = s.length();
        int b = t.length();
        while (i < a && prefix < b) {
            if (s.charAt(i) == t.charAt(prefix)) {
                prefix++;
            }
            i++;
        }
        System.out.println(b - prefix);

    }
}

/*
Example 1:

    Input: s = "coaching", t = "coding"
    Output: 4
    Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
    Now, t is a subsequence of s ("coachingding").
    It can be shown that appending any 3 characters to the end of s will never make t a subsequence.

Example 2:

    Input: s = "abcde", t = "a"
    Output: 0
    Explanation: t is already a subsequence of s ("abcde").

Example 3:

   Input: s = "z", t = "abcde"
   Output: 5
   Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
   Now, t is a subsequence of s ("zabcde").
   It can be shown that appending any 4 characters to the end of s will never make t a subsequence.*/
