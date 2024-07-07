package com.nt.surya;

public class Test01 {

	public static void main(String[] args) {
		
		String s1="Lipu";
		
		String s2="Litu";
		
		String s3="Lipu";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	}
}
