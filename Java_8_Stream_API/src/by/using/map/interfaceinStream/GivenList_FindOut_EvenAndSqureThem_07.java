package by.using.map.interfaceinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GivenList_FindOut_EvenAndSqureThem_07 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> collect07 = numbers
				.stream()
				.filter(n->n%2 ==0).map(n->n *n)
				.collect(Collectors.toList());

		System.out.println(collect07);
		
		//or
		
		  for(Integer i7 :collect07) 
		  {
			  System.out.println(i7); 
			  
		  }
		 
	}

}
