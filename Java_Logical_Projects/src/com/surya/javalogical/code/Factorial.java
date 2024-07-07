package com.surya.javalogical.code;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;

		long factorial = 1;

		for (int i = 1; i <= num; ++i) {
			factorial = factorial * i;
			// or factorial *=i;
		//	System.out.println("factorial : "+factorial);
			System.out.printf("Factorial of %d = %d", num, factorial);
		}
	}
}
