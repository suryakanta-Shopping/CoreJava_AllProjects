package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


/*
 * By using java 8 stream from a given string list find out the string lenth 
 * having 3 and make them uppercase
 * 
 */

public class Convert_ToUpperCase_01 {

	public static void main(String[] args) {

		List<String> lists = Arrays.asList("AAA", "BBB", "bb", "cc", "DD", "EEE", "fff", "zzz");

		List<String> collect02 = lists
				.stream()
				.filter(p -> p.length() > 3)
				.map(String::toUpperCase)
				.collect(Collectors.toList());

	//	System.out.println(collect02);
		// List<String> collect01 =
		// lists.stream().map(String::toUpperCase).collect(Collectors.toList());

		for( String s1 : collect02) {
			System.out.println(s1);
		}
	}
}


