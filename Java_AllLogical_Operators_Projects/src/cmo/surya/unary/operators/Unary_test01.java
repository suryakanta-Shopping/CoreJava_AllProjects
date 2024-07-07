package cmo.surya.unary.operators;

public class Unary_test01 {

	public static void main(String[] args) {
		
		int a=5; int b=20;
		
		int c= ++a;
		
		int d= b++;
		
		System.out.println(c); //6
		System.out.println(d); //20
	}
}
