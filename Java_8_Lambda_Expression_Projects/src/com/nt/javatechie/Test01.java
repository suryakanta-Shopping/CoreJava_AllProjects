package com.nt.javatechie;

@FunctionalInterface
interface Testcase01 {

	void m1();
//	void m2();
}

public class Test01 {

	public static void main(String[] args) {

		System.out.println("Hi");
		/*
		 * Testcase01 testcase01 = () -> { System.out.println("Hi Java"); }
		 */;

		// or

		Testcase01 testcase01 = () -> System.out.println("Hi Java");

		testcase01.m1();
	}

}
