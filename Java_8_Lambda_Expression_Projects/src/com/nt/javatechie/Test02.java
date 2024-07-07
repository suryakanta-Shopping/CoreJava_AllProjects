package com.nt.javatechie;

@FunctionalInterface
interface Calculator {

	void sum(int input);
}

public class Test02 {

	public static void main(String[] args) {

		/*
		 * Calculator calculator = (int input) -> { System.out.println("sum"+input); };
		 */
		//or
		
		Calculator calculator  = (input)->System.out.println("sum "+input);;
		calculator.sum(10);
	}

}
