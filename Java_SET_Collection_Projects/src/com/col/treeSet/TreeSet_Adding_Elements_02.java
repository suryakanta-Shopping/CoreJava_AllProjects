package com.col.treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Adding_Elements_02 {

	public static void main(String[] args) {

		Set<String> t = new TreeSet<String>();

		t.add("Lipu");
		t.add("Kaka");
		t.add("sapu");
		t.add("Nanu");
		t.add("Sipun");
		t.add("Somu");
		t.add("Litu");

		// System.out.println(t);

		for( String s1 : t) {
			System.out.println(s1);
		}

	}

}
