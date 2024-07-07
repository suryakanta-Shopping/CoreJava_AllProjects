package javagauides.surya.test;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpression_Using_IterateHashMapExp {

	public static void main(String[] args) {
		
		Map<Integer, String> courseMap=new HashMap<Integer,String>();
		courseMap.put(1, "c");
		courseMap.put(2, "c++");
		courseMap.put(3, "java");
		courseMap.put(4, "spring");
		courseMap.put(5, "Boot");
		courseMap.put(6, "scale");
		courseMap.put(7, "python");
		
		//jdk 8 for each with Lambda
		courseMap.forEach((k,v)->coursePrinter(k, v));
		
		
		//jdk 8 for each method reference
		
		courseMap.forEach(LambdaExpression_Using_IterateHashMapExp::coursePrinter);
}
	 // common method to print map key value
    private static void coursePrinter(Integer number, String brand) {
        System.out.println("course no : " + number + " and course name : " + brand);
    }
}



