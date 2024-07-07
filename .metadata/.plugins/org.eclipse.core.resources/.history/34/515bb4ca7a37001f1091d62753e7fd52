package com.col.treeSet;


// Step 1: Define the User class

public class User implements Comparable<User>{

	private String name;
	
	private int age;
	
	
//step 2: Implement compareTo to compare Users by age 
	
	@Override
	public int compareTo(User user) {
		return Integer.compare(this.age, user.age);
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
		return "User [name=" + name + ", age=" + age + "]";
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
}
