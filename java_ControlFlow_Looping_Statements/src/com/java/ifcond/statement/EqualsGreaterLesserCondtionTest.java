package com.java.ifcond.statement;

import java.util.Scanner;

public class EqualsGreaterLesserCondtionTest {

	public static void main(String[] args) {
	
		Scanner scn01 = new Scanner(System.in);
		int a = scn01.nextInt();
		int b = scn01.nextInt();

		if(a==b) {
			System.out.println("a is Equal to b");
		}
		else if (a>b) {
			System.out.println("a is Greater than b");
		}
		else {
			System.out.println("a less than b");
		}
	}

}
