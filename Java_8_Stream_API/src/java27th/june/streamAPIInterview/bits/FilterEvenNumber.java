package java27th.june.streamAPIInterview.bits;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {



	public static void main(String[] args) {
		
		/**
		 * 
		 * 2)	Given a list of integers, how would you 
		 * filter out the even numbers and count how many even numbers 
		 * are in the list using Stream API
		 */
		
		List<Integer> num=Arrays.asList(4,5,2,1,6,8,5,9,0,3,22,55,74,22,34);
		
	//	List<Integer> collect = num.stream().filter(p->p%2==0).collect(Collectors.toList());
		
		
		
		long evenCount = num.stream()
	            .filter(n -> n % 2 == 0)
	            .peek(System.out::println) // Optional: To print the even numbers
	            .count();

	        System.out.println("Count of even numbers: " + evenCount);
		
		//count the odd number
		
	//	long FilterEvenNumber=num.stream().filter(n->n % 2==0).count();
		
	//	System.out.println(FilterEvenNumber);
		
		System.out.println(evenCount);
		
		System.out.println("-------------");
		
//		System.out.println(collect);
		
		System.out.println("-------------");
		
//		collect.forEach(System.out::println);
	}

}
