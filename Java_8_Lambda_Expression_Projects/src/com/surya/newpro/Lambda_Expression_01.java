package com.surya.newpro;

public interface Lambda_Expression_01 {

	void Abstact_fun(int x);
	
	
	default void Default_method() {
		System.out.println("Default method in Interface");
	}
	
	public class Lambda_Test01 {

		public static void main(String[] args) {
			
			Lambda_Expression_01 l1=x ->System.out.println(x*x);
			
			l1.Abstact_fun(10);
		}
	}

}
