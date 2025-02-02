package com.col.treeSet;

import java.util.TreeSet;

public class TreeSet_Test01 {

	private TreeSet<User> userSet;

	public TreeSet_Test01() {
		userSet = new TreeSet<>();
	}

//Step 3: Adding and Removing Uses

	public void addUser(User user) {
		userSet.add(user);
	}

	public void removeUser(User user) {
		userSet.remove(user);
	}
//step 4: Retrieving the yoinggest and Oldest Users

	public User getYoungUser() {
		return userSet.first();
	}

	public User getOldestUser() {
		return userSet.last();
	}

	public static void main(String[] args) {

		TreeSet_Test01 ts = new TreeSet_Test01();

		ts.addUser(new User("Lipu", 25));
		ts.addUser(new User("Situ", 16));
		ts.addUser(new User("Sime", 23));
		ts.addUser(new User("Raka", 75));
		ts.addUser(new User("Mukesh", 44));
		ts.addUser(new User("Omm", 66));
		ts.addUser(new User("Sapu", 34));
		ts.addUser(new User("Kaka", 24));
		ts.addUser(new User("Anil", 55));

		System.out.println(" Youngest User: " + ts.getYoungUser());
		System.out.println(" Youngest User: " + ts.getOldestUser());

		ts.removeUser(new User("Raka", 75));
		
		System.out.println("-----------------------");

		System.out.println(" Youngest User: " + ts.getYoungUser());
		System.out.println(" Youngest User: " + ts.getOldestUser());
	}

}
