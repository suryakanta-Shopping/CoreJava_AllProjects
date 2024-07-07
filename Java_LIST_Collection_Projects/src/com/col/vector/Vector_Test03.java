package com.col.vector;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_Test03 {

	public static void main(String[] args) {

		Vector<Integer> l1 = new Vector<>();

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

		// Retrieve elements from the Vector

		System.out.println("Vector all Elements: " + l1);

		// Retrieve elements from the Vector in index based

		System.out.println("Element at index 5: " + l1.get(5));

		System.out.println("------------------");

		// Iterating over the vector

		System.out.println("Vector elements using Enumeration: ");

		Enumeration<Integer> enumeration = l1.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement() + " ");
		}

		System.out.println();

		// Sort elements in the Vector

		Collections.sort(l1);

		System.out.println("Vector sorted Elements: " + l1);

		System.out.println("------------------");
		// Remove an elements from the vector

		l1.remove(7);
		l1.remove(0);
		// l1.remove(8); // total in the above 7 index so it gives ArrayIndex Exception

		System.out.println("After remove Elements from Vector : " + l1);

		System.out.println("------------------");

		// Add other operations

		l1.addElement(77);
		System.out.println("After adding the Elements in Vector : " + l1);

		// Remove a specific elements from the vector (Not index based )

		l1.removeElement(Integer.valueOf(45));
		// or
		l1.removeElement(76);

		System.out.println("After remove  specific Elements from Vector : " + l1);

		System.out.println("------------------");

		// insert elements at a specific position
		l1.insertElementAt(101, 2);

		System.out.println("After insert specific Elements in Vector : " + l1);

		System.out.println("------------------");

		// setting elements at a specific position
		l1.setElementAt(202, 1);

		System.out.println("After setting specific Elements in Vector : " + l1);

		System.out.println("------------------");
		// Clearing all elements from the Vector
		l1.clear(); 
		System.out.println("Vector after clear: " + l1);

	}

}
