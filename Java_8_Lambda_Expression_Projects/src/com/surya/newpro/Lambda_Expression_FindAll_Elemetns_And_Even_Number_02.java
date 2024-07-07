package com.surya.newpro;

import java.util.ArrayList;

public class Lambda_Expression_FindAll_Elemetns_And_Even_Number_02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> allList=new ArrayList<>();
		allList.add(2);
		allList.add(3);
		allList.add(4);
		allList.add(6);
		allList.add(7);
		allList.add(23);
		allList.add(7);
		allList.add(44);
		allList.add(0);
		allList.add(7);
		allList.add(9);
		allList.add(10);
		
		allList.forEach(n-> System.out.println(n));
		
		System.out.println("\n");
		
		allList.forEach(n->{
			if (n%2==0) {
				System.out.println("Even Number "+n);
			}
			else {
				System.out.println("Odd Number "+n);
			}
		});
	}
}
