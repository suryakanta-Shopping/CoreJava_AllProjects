package com.java.ifcond.statement;

import java.util.Scanner;

public class IfElseCondtionCheck_01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int age = scn.nextInt();

		if (age > 18) {

			System.out.println("Person is Adult");
		} else {
			System.out.println("Person is not Adult");
		}

	}

}
