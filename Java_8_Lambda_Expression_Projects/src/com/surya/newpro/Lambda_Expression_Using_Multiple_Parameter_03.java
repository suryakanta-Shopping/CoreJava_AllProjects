package com.surya.newpro;

public class Lambda_Expression_Using_Multiple_Parameter_03 {

	interface FunInter01{
		public int m1(int a, int b);
	}
	
	interface FunInter02{
		void m2(String msg);
	}
	
	private int operate(int a, int b, FunInter01 fob) {
		
		return fob.m1(a, b); 
	}
	
	public static void main(String[] args) {
		
		FunInter01 add=(int x,int y)->x+y;
		
		FunInter01 sub=(int x,int y)->x-y;
		
		FunInter01 mul=(int x,int y)->x*y;
		
		FunInter01 div=(int x,int y)->x/y;
		
		Lambda_Expression_Using_Multiple_Parameter_03 tobj=new Lambda_Expression_Using_Multiple_Parameter_03();
		
		System.out.println("Add Value "+tobj.operate(4, 5, add));
		System.out.println("Sub Value "+tobj.operate(4, 5, sub));
		System.out.println("Mul Value "+tobj.operate(4, 5, mul));
		System.out.println("Div Value "+tobj.operate(4, 5, div));
		
		System.out.println("\n");
		
		FunInter02 tod02=message->System.out.println("Hello"+message);
		tod02.m2("world");
	}
}
