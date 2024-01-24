package basics;

public class ArrayClassMethod {

	public static void main(String[] args) {
		int[] i = new int[2];

		i[0] = 10;
		i[1] = 20;

		String packageName = i.getClass().getPackageName();
		String className = i.getClass().getName();

		System.out.println(packageName);
		System.out.println(className);

	}
}
