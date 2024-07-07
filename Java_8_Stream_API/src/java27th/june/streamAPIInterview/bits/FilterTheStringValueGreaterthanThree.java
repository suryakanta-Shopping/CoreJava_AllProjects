package java27th.june.streamAPIInterview.bits;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTheStringValueGreaterthanThree {

	public static void main(String[] args) {
		/**
		 * 
		 * Given a list of strings, how would you filter out strings with length greater
		 * than or equal to 3 and collect them into a set using Stream API?
		 */

		List<String> listOfString = Arrays.asList("a", "dddd", "adf", "fsdx", "aa");

		List<String> collectgreaterValue = listOfString
				.stream()
				.filter(s -> s.length() >= 3)
				.collect(Collectors.toList());

		System.out.println(collectgreaterValue);

		System.out.println("-----------------");

		collectgreaterValue.forEach(System.out::println);
	}

}
