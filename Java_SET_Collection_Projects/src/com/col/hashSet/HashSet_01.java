package com.col.hashSet;

import java.util.HashSet;

public class HashSet_01 {

	public static void main(String[] args) {
		
	
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(7);
		hs.add(12);
		hs.add(13);
		hs.add(5);
		hs.add(56);
		hs.add(51);
		hs.add(99);
		
		//System.out.println(hs);
		
		for(Integer hs1 :hs) {
			System.out.println(hs1);
		}

	}

}
