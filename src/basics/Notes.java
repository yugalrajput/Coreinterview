package basics;

public class Notes {

	public static void main(String[] args) {
		int[] notes = { 2000, 500, 200, 100, 50, 20, 2, 1 };
         //a=amount
		int a = 4552;
		//radius
		int r;

		for (int i = 0; i < notes.length; i++) {

			r = a / notes[i];

			if (r > 0) {

				System.out.println(notes[i] + " = " + r);
				a = a % notes[i];
			}
		}

	}
}
