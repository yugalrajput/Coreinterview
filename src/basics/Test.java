package basics;

public class Test {

	public static void main(String[] args) {
		int a = 121;
		int b= 123;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swaping without variable a ="+a+",b="+b);
		
		int temp = 0;
		a=b;
		b=temp;
		
		System.out.println("Swaping with variable a ="+a+",b="+b);
	}
}
