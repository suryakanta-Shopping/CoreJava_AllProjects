package com.nt.surya.newinterview;

public class String_Reverse {

	public static void main(String[] args) {

		String s1 = "Java";
		String eachchar = "";
		char ch;

		System.out.println("Before it change: " + s1);

		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i);
			eachchar = ch + eachchar;
		}
		System.out.println("After Reverse: " + eachchar);
	}

}
