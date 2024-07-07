package com.surya.encapsulation;

public class BankAccount {

	
	// to make encapsulation make all fields are private
	private double balance;
	
	// by using setter and getter method we can access in outside class
	public void setBalance(double balance) throws IllegalArgumentException{
		
		if(balance==0) {
			System.out.println("Don't pass Zero");
		}
		if(balance<0) {
			System.out.println("Don't pass -ve value");
		}
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
}
