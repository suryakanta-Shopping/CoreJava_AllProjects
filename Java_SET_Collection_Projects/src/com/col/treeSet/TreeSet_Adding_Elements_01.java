package com.col.treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Adding_Elements_01 {

	public static void main(String[] args) {

		Set<Integer> t = new TreeSet<Integer>();

		t.add(1);
		t.add(2);
		t.add(4);
		t.add(15);
		t.add(17);
		t.add(11);
		t.add(19);

		// System.out.println(t);

		for (Integer t1 : t) {
			System.out.println(t1);
		}

	}

}
