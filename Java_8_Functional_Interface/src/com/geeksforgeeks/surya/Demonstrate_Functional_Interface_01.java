package com.geeksforgeeks.surya;

public class Demonstrate_Functional_Interface_01 {

	public static void main(String[] args) {
		
		
		// create anonymous inner class object
		
		new Thread(new Runnable() {
			
			@Override
			public void run()
			{
				
				System.out.println("New thread created");
				
			}
		}).start();

	}

}
