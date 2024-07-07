package java27th.may.LogicalInterview.Bits;

public class Swapping_TwoNumber_Without_Using3rd {

	public static void main(String[] args) {
		
		int a=10;  // intialize 2 variables with values
		int b=20;
		
		System.out.println("Before swapping value of a: "+a+" value of b: "+b);
		//conditions
		
		a=a+b; //a=10+20=30
		b=a-b;  // b=30-20=10
		a=a-b;  // a=30-10=20
		
		System.out.println("AFter swapping value of a: "+a+" value of b: "+b);
	}

}
