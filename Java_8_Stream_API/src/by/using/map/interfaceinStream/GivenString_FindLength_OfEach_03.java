package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GivenString_FindLength_OfEach_03 {

	public static void main(String[] args) {
	
		List<String> list=Arrays.asList("AAA","BB","CCC","PPPPP");
		
		
		List<Integer> collect04 = list.stream().map(String::length).collect(Collectors.toList());

		
		System.out.println(collect04);
	}

}
