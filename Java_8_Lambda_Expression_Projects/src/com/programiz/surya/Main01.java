package com.programiz.surya;


interface myInterface{
	
	//abstract method
	double getPiValue();
}

public class Main01 {

	public static void main(String[] args) {
		
		myInterface ref;
		
		ref=() -> 3.1415;
		
		System.out.println("Pi value: "+ref.getPiValue());
		

	}

}
