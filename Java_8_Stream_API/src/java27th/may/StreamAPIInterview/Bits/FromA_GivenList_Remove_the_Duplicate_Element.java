package java27th.may.StreamAPIInterview.Bits;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FromA_GivenList_Remove_the_Duplicate_Element {

	public static void main(String[] args) {
	
		List<String> emp = 
				Arrays
				.asList("Lipu", "Sitfr", "Lipi", "Lipu", "keeeeeek", "", "lipi");
		
		List<String> removeduplicateEle = emp.stream().sorted().distinct().collect(Collectors.toList());

		System.out.println(removeduplicateEle);

	}

}
