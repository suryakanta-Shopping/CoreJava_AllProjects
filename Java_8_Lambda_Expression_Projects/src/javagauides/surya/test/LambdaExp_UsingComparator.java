package javagauides.surya.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExp_UsingComparator {
	
	
	static {
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

	}

	public static <Person> void main(String[] args) {
		
		List<Person> listOfPerson=new ArrayList<Person>();

	/*	listOfPerson.addAll("salu",34));
		listOfPerson.add(new Person("Mukesh", 14));
		listOfPerson.add(new Person("keshi", 17));
		listOfPerson.add(new Person("Suresh", 29));
		listOfPerson.add(new Person("Kohali", 30));
		listOfPerson.add(new Person("Keshab", 25));
		
		*/
		//By using without Lambda Expression
		
		/*Comparator<Person> comparator= new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return 01*/
		/*
		 * } };
		 */
	}

}
