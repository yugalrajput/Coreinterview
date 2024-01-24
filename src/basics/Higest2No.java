package basics;

public class Higest2No {

	public static void main(String[] args) {
		int[] t = { 30, 20, 40, 80, 10 };
		int temp = 0;
		int c = 0;

		for (int i = 0; i < t.length; i++) {
			if (temp < t[i]) {
				c = temp;
				temp = t[i];
			}
			if (c < t[i] && temp > t[i]) {
				c = t[i];
			}

		}
		System.out.println("Secound Highest = " + c);

	}
}
