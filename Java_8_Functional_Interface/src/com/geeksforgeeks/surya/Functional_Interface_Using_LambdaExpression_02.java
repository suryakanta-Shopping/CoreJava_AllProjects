package com.geeksforgeeks.surya;

public class Functional_Interface_Using_LambdaExpression_02 {

	public static void main(String[] args) {
		
		new Thread(() -> {
			System.out.println("New thread Created");
		}).start();
	}
}
