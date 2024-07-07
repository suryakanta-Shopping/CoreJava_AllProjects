package com.surya.fullLogicalQutn;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
	//	int number = sc.nextInt();
	//	System.out.println("Enter Number: "+number);
		int sumOfCube = 0;
		int temp;
		int number = 153;
		int a;
		temp = number;

		while (number > 0) {
			a = number % 10;
			number = number / 10;
			sumOfCube = sumOfCube + (a * a * a);
		}
		if (temp == sumOfCube) {
			System.out.println(temp + " is a Armstrong Number");
		} else {
			System.out.println(temp + " is not Armstrong Number");
		}

	}

}
