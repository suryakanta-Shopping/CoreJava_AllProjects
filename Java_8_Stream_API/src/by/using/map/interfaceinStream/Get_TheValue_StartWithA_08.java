package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Get_TheValue_StartWithA_08 {

	public static void main(String[] args) {
		
		

		List<String> names = Arrays.asList("Alicec", "Bob", "Charlie","AA","ABC");
		
		List<String> collect08 = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
		
		
		for(String i8 : collect08 ) {
			System.out.println(i8);
		}
	}

}