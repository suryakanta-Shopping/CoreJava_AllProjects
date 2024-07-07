package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_StringToInteger_05 {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("1", "2", "3");
		
		List<Integer> collect06 = strings
				.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		
		System.out.println(collect06);
	}

}
