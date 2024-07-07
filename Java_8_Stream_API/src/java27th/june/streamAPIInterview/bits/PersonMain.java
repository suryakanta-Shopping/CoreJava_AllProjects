package java27th.june.streamAPIInterview.bits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		/**
		 * 1) From a given list of persons findout the persons who have the age more
		 * than ‘30’.
		 */
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(101, "Lipu", 26));
		personList.add(new Person(104, "Sipu", 19));
		personList.add(new Person(99, "biki", 65));
		personList.add(new Person(122, "Lipu", 26));
		personList.add(new Person(134, "sibu", 13));
		personList.add(new Person(151, "praksh", 34));
		personList.add(new Person(174, "omm", 55));
		personList.add(new Person(135, "sani", 22));
		personList.add(new Person(11, "supi", 21));
		personList.add(new Person(171, "lucky", 11));
		personList.add(new Person(121, "digina", 27));
		personList.add(new Person(17, "dibya", 29));
		personList.add(new Person(1781, "para", 57));
		personList.add(new Person(135, "anish", 49));
		personList.add(new Person(1, "lantu", 16));
		personList.add(new Person(81, "litu", 19));
		personList.add(new Person(31, "sonu", 10));
		personList.add(new Person(701, "sonu", 92));
		personList.add(new Person(801, "fakira", 56));
		System.out.println(personList);

		List<Person> personfilterList = personList
				.stream()
				.filter(p -> p.getPerAge() > 30)
				.collect(Collectors.toList());

		System.out.println("----------------------");

		System.out.println(personfilterList);

		System.out.println("----------------------");

		// or

		personfilterList.forEach(System.out::println);
	}

}
