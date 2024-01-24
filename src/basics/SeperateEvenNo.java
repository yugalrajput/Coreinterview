package basics;

public class SeperateEvenNo {
	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : num) {
			if (number % 2 == 0) {
				System.out.print(number +",");

			}
		}
	}

}
