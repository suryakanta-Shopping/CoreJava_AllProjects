package com.col.LinkedHashSet;

import java.util.LinkedHashSet;

public class Linked_HashSet_01 {

	public static void main(String[] args) {
	
		LinkedHashSet<Integer> LHS=new LinkedHashSet<>();
		
		LHS.add(1);
		LHS.add(23);
		LHS.add(34);
		LHS.add(4);
		LHS.add(77);
		LHS.add(2);
		LHS.add(90);
		
		
		System.out.println(LHS);
		
		System.out.println("-------------");
		
		for(Integer lhs1 : LHS) {
			System.out.println(lhs1);
		}

	}

}
