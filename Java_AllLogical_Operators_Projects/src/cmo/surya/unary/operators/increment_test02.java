package cmo.surya.unary.operators;

public class increment_test02 {

	public static void main(String[] args) {
		
		int a=3,b=4;
		
		int c=++a+b+a+b+a+a++; // 24
			// 4+4+4+4+4+4=24 ,here 'a' value become 5 because a++ so it's value 
			//converted 4 to 5 , 5 values will be use in the next line
		
		int d=++b+a+b+a+a+b++; // 30
			//5+5+5+5+5+5=30 , here 'b' value become '6' ,it's change value 
			//will use in the next line
		
		int e=++a+b+a+++b++; //6+6+6+6=24, in this line 'a' become 7 , 'b' become '7'
		
		System.out.println(a); //7
		System.out.println(b); //7 
		
		int k=++a+b+++c+a+++a+++c+e+a+++b+e+++a+b+++c+b++; //b=8
		
		//8+7+25+8+9+9+26+24+11+8+
		
		System.out.println(k); //
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
