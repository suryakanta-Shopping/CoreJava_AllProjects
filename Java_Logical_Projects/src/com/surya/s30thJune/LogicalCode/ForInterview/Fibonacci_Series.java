package com.surya.s30thJune.LogicalCode.ForInterview;

public class Fibonacci_Series {

	public static void main(String[] args) {

		int number01 = 0;
		int number02 = 1;

		int number03, number;

		int count = 10;
		
		System.out.println(number01+ "---"+number02);

		for (number = 2; number < 0; ++number) {

			number03 = number01 + number02;

			System.out.println(number03);

			number01 = number02;
			number02 = number03;

		}

	}

}
