package com.ns.surya.PraticeProject.daily;

import java.util.Scanner;

public class Palindrome_Test {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		int number = scn.nextInt();
		
	//	int number =121; or
		
		int sum=0; int reiminder;
		
		int temp;
		
		temp=number;
		
		while(number>0) {
			
			reiminder = number % 10;
			
			sum= sum *10 +reiminder;
			
			number=number /10;
		}
		
		if(temp==sum) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}

	}

}
