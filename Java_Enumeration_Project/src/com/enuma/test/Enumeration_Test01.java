package com.enuma.test;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enumeration_Test01 {

	public static void main(String[] args) {
	
		Hashtable<Integer, String> studentDetails=new Hashtable<>();
		
		studentDetails.put(1, "Lipu");
		studentDetails.put(10, "sirish");
		studentDetails.put(12, "Omm");
		studentDetails.put(5, "sagar");
		studentDetails.put(66, "somu");
		studentDetails.put(34, "Rupa");
		
		Enumeration<Integer> enumeration=studentDetails.keys();

		while (enumeration.hasMoreElements()) {
		
			Integer key=enumeration.nextElement();
			
			String value=studentDetails.get(key);
			
			System.out.println(key+" : "+value);
			
		}
	}

}
