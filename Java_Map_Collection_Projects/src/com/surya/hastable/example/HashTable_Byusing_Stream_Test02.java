package com.surya.hastable.example;

import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class HashTable_Byusing_Stream_Test02 {

	public static void main(String[] args) {

		Hashtable<Integer, String> users = new Hashtable<>();

		users.put(1, "Alice - alice@example.com");
		users.put(2, "Bob - bob@example.com");
		users.put(3, "Charlie - charlie@example.net");
		users.put(4, "David - david@example.com");
		
		
		//Domain to filter by
		
		String domain="example.com";

		// filter users by email domain using stream API
		
		users.entrySet().stream().filter(e -> e.getValue().contains(domain)).collect(Collectors.toMap(Map.Entry::getValue , Map.Entry::getValue);
		)

		

		System.out.println();

	}

}
