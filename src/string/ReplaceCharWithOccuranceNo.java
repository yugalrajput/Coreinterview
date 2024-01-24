package string;

import java.util.Arrays;

public class ReplaceCharWithOccuranceNo {

	public static void main(String[] args) {

		String name = "Yugal";
		char charToReplace = 'a';

		if (name.indexOf(charToReplace) == -1) {
			System.out.println("Not Present");
			System.exit(0);

		}

		int count = 1;
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == charToReplace) {
				String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(Arrays.toString(ch));

	}

}
