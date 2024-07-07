package java27th.may.StreamAPIInterview.Bits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FromA_GivenList_FindOut_Emp_StartNameWithA {

	public static void main(String[] args) {

		
				// By Using filter(Predicate<T> predicate)
		
		List<String> emp = Arrays.asList("Lipu", "Situ", "Litu", "Abhi", "kk", "AA", "AS");

		List<String> collect = emp.stream()
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());

		System.out.println(collect);
	}

}
