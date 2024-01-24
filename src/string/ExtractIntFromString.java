package string;

public class ExtractIntFromString {

	public static void main(String[] args) {

		String name = "yugal1234";
		int[] arry = new int[name.length()];

		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				arry[i] = Integer.parseInt(String.valueOf(name.charAt(i)));
			}
		}

		/* System.out.println(arry[3] + " , " + arry[4]); */
		System.out.println(arry[5]+arry[6]);

	}

}