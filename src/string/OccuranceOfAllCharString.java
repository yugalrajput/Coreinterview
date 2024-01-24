package string;

public class OccuranceOfAllCharString {

	public static void main(String[] args) {

		/*
		 * StringBuffer sb = new StringBuffer("Yugal Rajput"); int count = 0; String s =
		 * sb.toString(); String name = s.toLowerCase();
		 */
		
		
		String name = "yugal rajput";
		int count = 0;

		for (char a = 'a'; a <= 'z'; a++) {

			for (int i = 0; i < name.length(); i++) {

				if (a == name.charAt(i)) {
					count++;
				}

			}
			if (count != 0) {
				System.out.println(a + " " + count);
				count = 0;
			} 

		}

	}

}
