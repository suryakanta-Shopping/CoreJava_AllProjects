package stringAll.methods.withUseCase;

public class ByUsing_CharAt_Methods_01 {

	public static void main(String[] args) {
		//  charAt() - Returns the character at the specified Index(position)  Return Type -char
		
													//  0-index	 1-index  2-index   3-index
		String s1= "Java"; //index start with zero here   j-0,	   a-1,	   v-2,	       a-3
		
		char ch00=s1.charAt(0);
		char ch01=s1.charAt(1);
		char ch02=s1.charAt(2);
		char ch03=s1.charAt(3);
	//	char ch04=s1.charAt(4); // it throws IndexOutOfBoundsException
		
		System.out.println(ch00); //j
		System.out.println(ch01); //a
		System.out.println(ch02); //v
		System.out.println(ch03); //a
	}

}
