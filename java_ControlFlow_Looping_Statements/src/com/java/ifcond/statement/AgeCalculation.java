package com.java.ifcond.statement;

import java.util.Scanner;

public class AgeCalculation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age=sc.nextInt();
		//System.out.println("Enter the age: "+age);

		if(age>18) {
			System.out.println(age +" is a adult age");
		}
		else {
			System.out.println(age +" is not adult");
		}
	}

}
