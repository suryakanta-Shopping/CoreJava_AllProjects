package Stream.IntermediateOperation.MapFunctionEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFunctionEx_ToUpperCase {

	public static void main(String[] args) {

		List<String> listofElements = Arrays.asList("Hi", "Hello", "Java", "Bye", "C", "Php");

		List<String> toUpperCase = listofElements.stream()
									.map(x->x.toUpperCase())
				  //or  		 	.map(String::toUpperCase)
									.collect(Collectors.toList());
		
		System.out.println(toUpperCase);
	}

}
