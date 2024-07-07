package java27th.june.streamAPIInterview.bits;

import java.util.Arrays;
import java.util.List;

public class FilterEvenAndCountTheNumber {
	
	/**
	 * 
	 * FilterEvenAndCountTheNumber
	 * @param args
	 */

	public static void main(String[] args) {
	

		List<Integer> nums=Arrays.asList(4,5,2,1,6,8,5,9,0,3,22,55,74,22,34);
		
		long countEvenList = nums.stream().filter(n->n % 2==0)
		.peek(System.out::println)
		.count();
		
		System.out.println(countEvenList);
	
	}

}
