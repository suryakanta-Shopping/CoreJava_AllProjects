package java27th.may.stringBuffertestcase;

public class Test01 {

	public static void main(String[] args) {
	
		String s1="Java";

		StringBuffer sb1=new StringBuffer("world");
		StringBuffer sb2=new StringBuffer("Hi");
		
		StringBuffer sb3=sb1.append("Hello");
		
		
		
		System.out.println(sb1);
		System.out.println(sb3);
		System.out.println(sb2);
		

	}

}
