package java27th.may.StreamAPIInterview.Bits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class Filter_listof_Person_BasedOnAge_Test01 {

	public static void main(String[] args) {

		
		// create a list of Person objects
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("lipu",26));
		list.add(new Person("litu",24));
		list.add(new Person("kaka",27));
		list.add(new Person("Anil",26));
		list.add(new Person("Sapu",29));
		list.add(new Person("Nanu",30));
		list.add(new Person("Lani",25));
		
		
		//use Stream API to Filter , map and collect names
		
		List<String> names = list.stream()
		.filter(n->n.getAge()>=26) 			// Filter persons older or equals to age 26 
		.map(Person::getName)				// Extract names
		.collect(Collectors.toList());      // collect names into a list
		
		//print the result
		
		System.out.println(names);
	}

}
