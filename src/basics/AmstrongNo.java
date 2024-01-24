package basics;

public class AmstrongNo {

	public static void main(String[] args) {
		int t =153;
		int a = t;
		int r;
		int sum = 0;
		
		while(t!=0) {
			
			r=t%10;
			sum=sum+(r*r*r);
			t=t/10;
			
			
		}
		if(sum==a) {
			System.out.println("Amstrong No");
		}
		else {
			System.out.println("Not Amstrong No");
		}
		

	}

}
