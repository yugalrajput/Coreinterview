package string;

public class StringFile {

	public static void main(String[] args) {

		String[] file = { "Hello.java", "Hello.txt", "Hello.jpg", "Hello.img", "yugal.txt" };

		for (int i = 0; i < file.length; i++) {

			if (file[i].endsWith(".txt")) {
				System.out.println(file[i]);
			}
		}

	}
}
