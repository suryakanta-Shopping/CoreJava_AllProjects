package com.col.treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {

	@Override
	public int compareTo(Employee employee) {

		return Integer.compare(this.age, employee.age);
	}

	private String name;

	private Integer age;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

}

public class TreeSet_Adding_Elements_03 {

	public static void main(String[] args) {

//		Set<String,Integer> t = new TreeSet<String,Integer>(); this process is not possible

		// so we need to create Custome Object in TreeSet

		TreeSet<Employee> e1 = new TreeSet<>();
		e1.add(new Employee("Kaka", 12));
		e1.add(new Employee("somu", 23));
		e1.add(new Employee("Lipu", 78));
		e1.add(new Employee("Liku", 16));
		e1.add(new Employee("Nanu", 22));
		e1.add(new Employee("Raka", 34));

		// System.out.println(e1);

		for (Employee employee : e1) {

			System.out.println(employee);
		}
	}

}
