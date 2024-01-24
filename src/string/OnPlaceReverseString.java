package string;

public class OnPlaceReverseString {

	public static void main(String[] args) {
		String name = "Yugal Rajput";
		String[] a = name.split(" ");
         
		for(int i=0;i<a.length;i++) {
			
			for(int j=a[i].length()-1;j>=0;j--) {
				System.out.println(a[i].charAt(j));
				
			}
			System.out.println(" ");
			
		}
		
		
	}
}
