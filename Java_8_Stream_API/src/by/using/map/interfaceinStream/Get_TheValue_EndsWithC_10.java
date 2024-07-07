package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Get_TheValue_EndsWithC_10 {

	public static void main(String[] args) {
		
		

		List<String> names = Arrays.asList("AliceC", "Bob", "Charlie","AA","ABC");
		
		List<String> collect08 = names.stream().filter(n->n.endsWith("C")).collect(Collectors.toList());
		
		
		for(String i8 : collect08 ) {
			System.out.println(i8);
		}
	}

}
