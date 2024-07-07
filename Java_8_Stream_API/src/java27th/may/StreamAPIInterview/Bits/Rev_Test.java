package java27th.may.StreamAPIInterview.Bits;

public class Rev_Test {

	public static void main(String[] args) {
	
		String s1="Lipu";
		
		String rev="";
		System.out.println(rev);
		System.out.println(rev);
		System.out.println(rev);
		
		char ch;
		
		
		for(int i=0; i<s1.length();i++) {
			
			System.out.println(s1.length());
			
			
			ch=s1.charAt(i);
			System.out.println(ch);
			rev=ch+rev;    //u   //p   //i  //L 
			//System.out.println(rev);
		}

		System.out.print(rev); //upiL

	}

}
