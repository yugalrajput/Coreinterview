package basics;

public class TestFunInterface {

	public static void main(String[] args) {
		FunInterface fn = new FunInterface() {

			public int sum(int a, int b) {

				return (a + b);
			}
		};

		int a = 10;
		int b = 20;
		System.out.println(fn.sum(a, b));
		FunInterface.multi(a, b);
		fn.sub(a, b);

	}
}
