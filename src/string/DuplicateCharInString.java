package string;

public class DuplicateCharInString {
	
	public static void main(String[] args) {
		String name = "Rugal Rajput";
		name = name.toLowerCase();
		int count =0;
		char[] ch = name.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			
			count = 1;
			
			for(int j = i+1; j<ch.length; j++) {
				
				if(ch[i]==ch[j]&& ch[i]!=' ') {
					count++;
					ch[j]='0';
					
				}
			}
			if(count>1 && ch[i]!='0') {
				System.out.println(ch[i]);
			}
		}
		
	}

}
