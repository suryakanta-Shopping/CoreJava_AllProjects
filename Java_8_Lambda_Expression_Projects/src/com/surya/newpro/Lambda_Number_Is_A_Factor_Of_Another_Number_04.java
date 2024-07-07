package com.surya.newpro;

public class Lambda_Number_Is_A_Factor_Of_Another_Number_04 {

	interface Test{
		boolean testmeth(int a, int b);
	}
	
	
	
	public static void main(String[] args) {
		
		 Test isFactor=(a,b)->(a%b)==0;
		 if (isFactor.testmeth(10, 2)) {
			System.out.println("2 is the factor of 10");
		}
		 if (!isFactor.testmeth(10, 3)) {
			System.out.println("3 is not the factor of 10");
		}
		
		
	}
}
