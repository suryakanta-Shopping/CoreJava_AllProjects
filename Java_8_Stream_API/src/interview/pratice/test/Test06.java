package interview.pratice.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test06 {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<Integer>();
		for (int i = 1; i < 20; i++) {
			num.add(i);
		}

		Integer[] l1=num.stream().filter(p->p%2==0).toArray(Integer[]::new);
		System.out.println(l1);
	}

}
