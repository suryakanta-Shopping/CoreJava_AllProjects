package com.surya.s30thJune.LogicalCode.ForInterview;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		System.out.println("Enter the Number is : "+num);
		
		//or 
	//		int num =370 ;
		
		 int temp; int number;
		
		int total=0;
		
		number = num;
		
		while(number !=0) {
			
			temp = number % 10;
			
			total= total+temp * temp * temp;
			
			number=number /10;
			
		}
		
		if(total==num) {
			System.out.println("Number Is Armstrong");
		}
		else {
			System.out.println("Number Is not Armstrong");
		}

	}

}
