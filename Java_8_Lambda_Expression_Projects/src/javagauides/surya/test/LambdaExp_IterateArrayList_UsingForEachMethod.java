package javagauides.surya.test;

import java.util.Arrays;
import java.util.List;

public class LambdaExp_IterateArrayList_UsingForEachMethod {

	
	
	public static void main(String[] args) {
		
	
	
	List<String> courses=Arrays.asList("c","c++","java","spring","Boot");
	
	
	//java 8 streaming example lambda Expression
	courses.stream().forEach(lambdaExp-> print(lambdaExp));
	
	//java 8 streaming example method reference
	
	courses.stream().forEach(LambdaExp_IterateArrayList_UsingForEachMethod::print);
	
	//java 8 for each with lambda
	
	courses.forEach(lambdaexp -> print(lambdaexp));
	
	//jdk 8 for each
	
	courses.forEach(LambdaExp_IterateArrayList_UsingForEachMethod::print);
}

	private static Object print(String lambdaExp) {
		System.out.println("Course Name :: "+lambdaExp);
		return null;
	}
}