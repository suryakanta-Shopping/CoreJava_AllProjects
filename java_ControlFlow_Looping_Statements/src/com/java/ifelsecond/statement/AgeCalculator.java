package com.java.ifelsecond.statement;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the age :" );
		int age=scn.nextInt();
		
		//children 0-5,junior 5-17,adult 17-35,sinor 35-60,oldpeople 60-100

		if(age<=5 ) {
			System.out.println(age+ " age is a Children");
		}
		if(age<17) {
			System.out.println(age+ " age is a Junior");
		}
		if(age<35) {
			System.out.println(age+ " age is a adult");
		}
		if(age<60) {
			System.out.println(age+ " age is a sinor");
		}
		else {
			System.out.println(age+ " age is a old people");
		}
	}

}
