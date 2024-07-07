package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Duplicate_FromA_GivenString {

	public static void main(String[] args) {
		
		List<String> colors = Arrays.asList("red", "blue", "red", "green");
		
		List<String> collect07 = colors
				.stream()
				.distinct()
				.collect(Collectors.toList());
		
		for(String s1 : collect07) {
			System.out.println(s1);
		}

	}

}