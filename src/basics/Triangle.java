package basics;

public class Triangle {

	public static void main(String[] args) {
		// for (int i = 1; i <= 4; i++) {
		// for (int j = 4 - i; j > 0; j--) {
		// System.out.print("");
		// }
		// for (int k = i; k > 0; k--) {
		// System.out.print(i + "");
		// System.out.println("*"+" ");
		// }
		// System.out.println(" ");
		// }

		int row = 8;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}
}
