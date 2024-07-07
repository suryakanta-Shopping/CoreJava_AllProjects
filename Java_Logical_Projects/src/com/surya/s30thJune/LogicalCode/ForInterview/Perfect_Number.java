package com.surya.s30thJune.LogicalCode.ForInterview;

import java.util.Iterator;

public class Perfect_Number {

	public static void main(String[] args) {

		/*
		 * 
		 * 28 = 1+2+4+7+14
		 */

		int number = 28;
		int sum = 0;

		for (int i = 1; i < number; i++) {
			
			if (number % i == 0) {
				sum = sum + i;
			}
		}
			if (sum == number) {
				System.out.println("Number is perfect");
			} else {
				System.out.println("Number is Not perfect");
			}
		
	}

}
