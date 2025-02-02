package com.col.vector;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Vector_Test02 {

	public static void main(String[] args) {
		
		Vector<Integer> l1=new Vector<>();
		
		l1.add(45);
		l1.add(1);
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(6);
		l1.add(2);
		l1.add(8);
		l1.add(9);
		l1.add(34);
		l1.add(56);
		l1.add(76);
		
		/*
		 * for( Integer val : l1) { System.out.println(val); }
		 */
		
		//Retrieve elements from the Vector
		
		System.out.println("Vector all Elements: "+l1);
		

		System.out.println("------------------");
		
		//Sort elements in the Vector
		
		Collections.sort(l1);
		
		System.out.println("Vector sorted Elements: "+l1);
		
		System.out.println("------------------");
		//Remove an elements from the vector
		
		l1.remove(7);
		l1.remove(0);
	//	l1.remove(8); // total in the above 7 index so it gives ArrayIndex Exception
		
		System.out.println("After remove Elements from Vector : "+l1);
		
		//Remove a specific elements from the vector (Not index based )
		
		l1.removeElement(Integer.valueOf(45));
		//or
		l1.removeElement(76);
		
		System.out.println("After remove  specific Elements from Vector : "+l1);
		
		
		
	}

}
