package cmo.surya.unary.operators;

public class increment_test01 {

	public static void main(String[] args) {
		
		int a=2, b=3;
		
		int c=++a+b+a++;
			//++a=3 ,+b=3+3=6+3=9 
		
		System.out.println(c); //9
	}
}
