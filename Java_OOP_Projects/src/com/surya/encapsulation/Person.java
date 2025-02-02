package com.surya.encapsulation;

public class Person {

	
	//1.encasulation 1st property make fields/variables as private 
	private String name;
	private int age ;
	
	//accessing by setter and getter method
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0) {
		this.age=age;
	}
	}
	
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.setName("Lipu");
		p1.setAge(27);
		
		Person p2=new Person();
		p2.setName("sinu");
		p2.setAge(44);
		
		
		System.out.println(p1.getName()+"---"+p1.getAge()+"--"+p2.getName()+"---"+p2.getAge());
	}
}
