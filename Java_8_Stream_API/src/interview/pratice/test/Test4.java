								//List.stream()

package interview.pratice.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<20;i++) {
			list.add(i);
		}
		
		list.forEach(p->System.out.println(p));
	}
}
