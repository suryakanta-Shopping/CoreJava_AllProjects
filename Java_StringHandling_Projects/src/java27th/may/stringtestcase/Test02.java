package java27th.may.stringtestcase;

public class Test02 {

	public static void main(String[] args) {
	
		String s1="Java";
		
		String s2=new String("Java");
		
		String s3="java";
		
		String s4=new String("java");		

		System.out.println(s1==s1); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s4)); //false

	}

}
