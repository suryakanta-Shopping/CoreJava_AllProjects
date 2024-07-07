package java27th.may.LogicalInterview.Bits;

public class Swapping_Two_Number_Using3rd_Variable {

	public static void main(String[] args) {
	
		// initailize 2 number using there value
		// 'temp variable only declare not initialized'
		
		int a=10;
		
		int b=20;
		
		int temp; // temp variable
		
		System.out.println("Before Swapping the a value: "+a);
		System.out.println("Before Swapping the b value: "+b);
		System.out.println();

		temp=a; // temp=10
		a=b;   //a=20
		b=temp; //b= 10
		
		System.out.println("After Swapping the a value: "+a);
		System.out.println("After Swapping the b value: "+b);
		System.out.println();
	}

}
