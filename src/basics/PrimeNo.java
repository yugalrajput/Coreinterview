package basics;

public class PrimeNo {

	public static void main(String[] args) {
		int t =157;
		int count =0;
		
		for(int i =2;i<t;i++) {
			if(t%i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("this is prime no");
		}
		else {
			System.out.println("this is not prime no");
		}
	}
}
