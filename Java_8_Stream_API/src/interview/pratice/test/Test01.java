package interview.pratice.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> list = numbers.stream() 
		.filter(e->e%2==0) //filter even number
		.toList();			//collect the result into a new list  //or
		
		//.collect(Collectors.toList());
		System.out.println(list);
	}

}
