package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		char[] ar1 = s1.toCharArray();
		char[] ar2 = s2.toCharArray();

		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1, ar2)) {
			System.out.println(s1 + " " + s2 + "They are Anagram");
		}
		else {
			System.out.println(s1 + s2 + "They Are Not Anagram");
		}
		
		
	}

}
