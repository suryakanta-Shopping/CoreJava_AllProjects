package com.nt.javatechie;


@FunctionalInterface
interface Substraction{
	
	int sub(int i1, int i2);
}

public class Test04 {

	public static void main(String[] args) {
		
		Substraction substraction=(i1,i2)->{
			if (i1>i2) {
				throw new IllegalArgumentException("I1 is Greater");
			}
			else {
				return i1-i2;
			}
		};

	//	System.out.println(substraction.sub(20, 15));
		System.out.println(substraction.sub(5, 15));
	}

}
