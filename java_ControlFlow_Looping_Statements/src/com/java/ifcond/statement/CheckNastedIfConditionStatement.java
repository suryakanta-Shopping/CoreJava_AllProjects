package com.java.ifcond.statement;

import java.util.Scanner;

public class CheckNastedIfConditionStatement {

	public static void main(String[] args) {

		Scanner scn01 = new Scanner(System.in);
		int button = scn01.nextInt();

		/**
		 * if (button == 0) { System.out.println("Hi"); } else if (button == 1) {
		 * System.out.println("Hello");
		 * 
		 * } else if (button == 2) { System.out.println("Namaskar"); } else {
		 * System.out.println("Invalid"); }
		 * 
		 * 
		 */
		// Use Of Switch

		switch (button) {
		case 1:
			System.out.println("Hi");
			break;

		case 2:
			System.out.println("Hello");
			break;
		case 3:
			System.out.println("Namaste");
			break;
		default:
			System.out.println("Invalid");
		}

	}
}