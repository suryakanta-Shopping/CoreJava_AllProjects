package java27th.may.StreamAPIInterview.Bits;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FromA_GivenList_Count_Employee {

	public static void main(String[] args) {
		
		// map(Function<T, R> mapper)
		
		List<String> emp = Arrays.asList("Lipu", "Sitfr", "L", "Abeeehi", "keeeeeek", "", "AeS");

		List<Integer> countlength = emp.stream().map(String::length)
					.collect(Collectors.toList());

		System.out.println(countlength);
	}

}
