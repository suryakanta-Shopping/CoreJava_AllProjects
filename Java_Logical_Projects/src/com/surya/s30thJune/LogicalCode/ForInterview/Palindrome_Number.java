package com.surya.s30thJune.LogicalCode.ForInterview;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		
		System.out.println("Enter the Number is : "+number);
		
		/*
		 * Find out the number is Palindrome or Not 
		 * 
		 * i.e 121 ,242 ,12121 etc
		 * 
		 * important point  1 % 10 = 1 , 1 /10 =0
		 */
		
	//	int number = 121;  here u can use scanner class or direct value u can use

		int remainder;

		int sum = 0;
		
		int temp;

		temp = number;   // as for while loop condition ,1st take intialilization value

		while (number > 0) {	// 2nd 1-check con , con is 121>0 'true'// 2-check cond 12>0 is true // 3rd con 1>0 cond is true  // 4th cond 0>0 is false it will go out side the loop

			remainder = number % 10;  // remainder =121 % 10 = 1 ,  remainder= 12 % 10 = 2  , remainder= 1 % 10 = 1

			sum = sum * 10 + remainder; // 3rd step is 'updation'  // step-1 sum=0*10+1=1 //step-2 sum= 1*10+2=12 //step-3 sum= 12*10+1=120+1=121

			number = number / 10;  //step-1 number = 121 / 10 = 12  //step-2 number = 12 / 10 = 1 //step-3 number = 1 /10 =0
		}

		if (temp == sum) {   // when it is 0> 0 cond false then it will come here & check 121 =121 cond is true then print If inside statement "Number is Palindrome"
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

	}

}
