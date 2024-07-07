package javagauides.surya.test;

import java.util.HashSet;
import java.util.Set;

public class LambdaExp_IterateHashSet_ForEachMethod {

	public static void main(String[] args) {
		
		Set<String> topic=new HashSet<String>();
		topic.add("java");
		topic.add("c");
		topic.add("c++");
		topic.add("php");
		topic.add("python");
		topic.add("c##");
		topic.add("rube");

		//jdk 8 stream using Lambda Expression
		
		topic.stream().forEach(diffSubject -> allTopic(diffSubject));
		
		
		//jdk 8 using Method reference
		
//		topic.stream().forEach(LambdaExp_IterateArrayList_UsingForEachMethod::allTopic);

		//jdk 8 for each with lambda
		
		topic.forEach(topica -> allTopic(topica));
		
	//	topic.forEach(LambdaExp_IterateArrayList_UsingForEachMethod::allPrint);
	}

	private static Object allTopic(String topic) {
		System.out.println("topic Name:: "+topic);
		return null;
	}

}
