package leetcode;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {

        //Using Arrays and Hashing

        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            map[t.charAt(i) - 'a']--;
        }
        for (int element : map) {
            if (element != 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Anagram ana = new Anagram();
        System.out.println(Anagram.isAnagram("anagram", "nagaram"));//true

        System.out.println(Anagram.isAnagram("rat", "car"));//false
    }


}
