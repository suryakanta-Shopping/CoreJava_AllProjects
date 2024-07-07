package java27th.may.stringtestcase;

public class Test01 {

	public static void main(String[] args) {
	
		String s1="Java";
		
		String s2="Hi";
		
		String s3="Hello";
		
		String s4="Java";
		
		String s5="java";
		
		System.out.println(s1==s4); //true , compair the value
		System.out.println(s1.equals(s4)); //true , compair the reference
		System.out.println(s1==s5); // false
		System.out.println(s1.equals(s5)); // false
		System.out.println(s4.equals(s5)); // false
		System.out.println();
		System.out.println();

	}

}
