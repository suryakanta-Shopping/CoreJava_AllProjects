package com.col.vector;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Vector_Sort_Ele_ByEnumeration_04 {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		Vector<Integer> l1=new Vector<>();
		
		l1.add(1);
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(6);
		l1.add(2);
		l1.add(8);
		l1.add(9);
		
		Enumeration<Integer> enumeration=l1.elements();
		while (enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement()+" ");
			
		}

	}

}
