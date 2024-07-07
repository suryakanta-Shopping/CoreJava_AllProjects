package interview.pratice.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test08 {

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

		members.stream()
		.filter(p->p.startsWith("A"))
		.map(String::toUpperCase).
		forEach(System.out::println);
	}

}
