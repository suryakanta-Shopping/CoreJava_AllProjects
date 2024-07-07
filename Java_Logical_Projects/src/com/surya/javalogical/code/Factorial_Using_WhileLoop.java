package com.surya.javalogical.code;

public class Factorial_Using_WhileLoop {

	public static void main(String[] args) {
		int num = 5, i = 1;

		long factorial = 1;

		while(i<=num) {
			factorial=factorial*i;
			//or factorial *=i;
			++i;
		}
		System.out.println(factorial);
	}
}
