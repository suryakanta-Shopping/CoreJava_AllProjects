package com.col.vector;

import java.util.List;
import java.util.Vector;

public class Vector_Test01 {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		List<Integer> l1=new Vector<>();
		
		l1.add(1);
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(6);
		l1.add(2);
		l1.add(8);
		l1.add(9);
		
		System.out.println(l1);
		
		for( Integer val : l1) {
			System.out.println(val);
		}

	}

}
