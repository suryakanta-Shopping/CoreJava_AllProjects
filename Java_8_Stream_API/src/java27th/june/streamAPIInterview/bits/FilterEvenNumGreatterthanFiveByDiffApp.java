package java27th.june.streamAPIInterview.bits;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumGreatterthanFiveByDiffApp {

	
	

	public static void main(String[] args) {
		
		List<Integer> listofnum=Arrays.asList(2,3,1,0,4,5,53,8,9,5,68,43,7,6);
		
		List<Integer> collectEvenwithgreaterthanFive = listofnum
															.stream()
																.filter(n->n % 2==0)
																.filter(n->n > 5)
																	.collect(Collectors.toList());
		System.out.println(collectEvenwithgreaterthanFive);
		
		System.out.println("==================");
		
		collectEvenwithgreaterthanFive.forEach(System.out::println);
		
	}

}
