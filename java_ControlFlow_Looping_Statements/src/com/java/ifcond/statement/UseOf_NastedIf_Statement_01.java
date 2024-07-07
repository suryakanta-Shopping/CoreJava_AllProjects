package com.java.ifcond.statement;

import java.util.Scanner;

public class UseOf_NastedIf_Statement_01 {

	public static void main(String[] args) {

		Scanner scn01 = new Scanner(System.in);
		int agenextInt01 = scn01.nextInt();
//		int agenextInt02 = scn01.nextInt();

		if (agenextInt01 > 18) {
			System.out.println("age is less than 18");
		} else if (agenextInt01 > 19) {
			System.out.println("Person age is more than 18");
		} else if (agenextInt01 > 30) {
			System.out.println("Person is young age");
		} else if (agenextInt01 > 60) {
			System.out.println("Middle age ");
		} else if (agenextInt01 > 70) {
			System.out.println("Old age");
		} else {
			System.out.println("dead");
		}

	}
}
