package interview.pratice.test;

import java.util.stream.Stream;

public class Test03 {

	public static void main(String[] args) {

		Stream<Integer> stream=Stream.of(new Integer[] {1,2,2,3,4,5,6,7,8,9});
		
		 stream.forEach(p->System.out.println(p));
	}
}
