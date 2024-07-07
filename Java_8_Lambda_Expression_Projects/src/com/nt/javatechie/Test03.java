package com.nt.javatechie;

@FunctionalInterface
interface Addition {

	int add(int a, int b, int c);
}

public class Test03 {

	public static void main(String[] args) {

		/*
		 * Addition addition=(a,b,c)->{ return a+b+c;
		 * 
		 * };
		 */

		// or

		Addition addition = (a, b, c) -> a + b + c;
		System.out.println(addition.add(2, 4, 4));

	}

}
