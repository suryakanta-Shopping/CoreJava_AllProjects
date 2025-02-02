package com.nt.singleton;

public class Singleton_Test02_ToMake_ThreadSafe {

	/*
	 * Singleton class have a private static instance of itself
	 * 
	 * private constructor , and a public static method to provide access to the
	 * instance
	 */

	// Step-1 : Create a private static instance of the class
	private static Singleton_Test02_ToMake_ThreadSafe instance;

	// Step 2: Make the constructor private so that the class cannot be instantiated
	// from outside

	private Singleton_Test02_ToMake_ThreadSafe() {

		// private constructor to prevent instatiation
	}

	// step-3 private a public static method that return the instance of the class

	//to make it thread safe we have use synchronized keyword
	public static  synchronized Singleton_Test02_ToMake_ThreadSafe getInstance() {

		if (instance == null) {
			instance = new Singleton_Test02_ToMake_ThreadSafe();
		}

		return instance;
	}
	
	// Example method to demonstrate the functionality of the Singleton instance
	
	public void showMessage() {
		System.out.println("It is singleton");
	}

	public static void main(String[] args) {

		//get the only instance of singleton
		Singleton_Test02_ToMake_ThreadSafe s=Singleton_Test02_ToMake_ThreadSafe.getInstance();
		
		//show the message
		
		s.showMessage();
	}

}
