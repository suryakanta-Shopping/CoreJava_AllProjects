package com.ns.surya.PraticeProject.daily;

public class Reverse_String_Tet01 {

	public static void main(String[] args) {
		
		String s="JavaProgram";
		
		char[] charArray = s.toCharArray();
		
		System.out.println(charArray.length); //11
		
		for(int i=charArray.length-1; i>=0 ;i--) {
			
			System.out.println(charArray[i]);
		}

	}

}
