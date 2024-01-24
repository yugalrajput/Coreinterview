package basics;

public class RandomNo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print((int) (Math.random() * 10)+",");
		}
	}
}
