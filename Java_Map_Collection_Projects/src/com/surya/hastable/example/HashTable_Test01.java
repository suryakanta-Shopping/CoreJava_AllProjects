package com.surya.hastable.example;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_Test01 {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(1, "Lipu");
		ht.put(2, "ranu");
		ht.put(4, "biki");
		ht.put(7, "Lulu");
		ht.put(9, "sipu");

	//	System.out.println(ht);

	
	  for (Map.Entry<Integer, String> mapresult : ht.entrySet()) {
	  System.out.println(mapresult); }
	
		
		//remove element from map
		ht.remove(1);
		
		System.out.println(ht);
		
		System.out.println("=====");
		
		//getting the specific element from Hashmap
		String string01 = ht.get(4);
		
		System.out.println(string01);

	}

}
