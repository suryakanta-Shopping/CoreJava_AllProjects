package interview.pratice.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test07 {

	public static void main(String[] args) {
	
		List<String> members= new ArrayList<>();
		members.add("AAAAAA");
		members.add("Amitabh");
		members.add("Shekhar");
		members.add("Aman");
		members.add("Rahul");
		members.add("Shahrukh");
		members.add("Salman");
		members.add("Yana");
		members.add("Lokesh");

		List<String> s1=members.stream()
		.filter(p->p.startsWith("A"))
		//.forEach(System.out::println);
		.collect(Collectors.toList());
		System.out.println(s1);
	}

}
