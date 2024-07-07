package com.col.treeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Retrieving_Specific_Elements {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>();

		numbers.add(12);
		numbers.add(5);
		numbers.add(42);
		numbers.add(52);
		numbers.add(123);
		numbers.add(11);
		numbers.add(62);

		for (Integer e1 : numbers) {
			System.out.println(e1);
		}

		/*
		 * System.out.println(numbers.last()); System.out.println(numbers.first());
		 * System.out.println(numbers.headSet(123));
		 */
	}

}