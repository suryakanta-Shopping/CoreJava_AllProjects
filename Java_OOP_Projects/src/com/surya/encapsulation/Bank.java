package com.surya.encapsulation;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		BankAccount acc1 = new BankAccount();
		while (true) {
			try {
				System.out.println("Enter Balance: ");
				double balance = scn.nextDouble();
				scn.nextLine();

				// acc1.balance=balance; // CE

				acc1.setBalance(balance);
				System.out.println("Current Balance is: " + acc1.getBalance());
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
