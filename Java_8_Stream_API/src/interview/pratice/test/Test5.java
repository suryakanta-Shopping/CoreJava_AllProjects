								//Stream.generate() or Stream.iterate()
//In the given example, we are creating a stream from generated elements.
//This will produce a stream of 20 random numbers. 
//We have restricted the elements count using limit() function.

package interview.pratice.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {

		Stream<Integer> randomnum=Stream.generate(()->new Random().nextInt(100));
		randomnum.limit(10).forEach(System.out::println);
	}
}
