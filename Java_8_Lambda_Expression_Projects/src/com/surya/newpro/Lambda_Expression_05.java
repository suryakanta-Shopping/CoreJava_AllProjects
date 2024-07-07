package com.surya.newpro;

interface test03{
	
	void  print(Integer p, Integer q);
	
}

public class Lambda_Expression_05 {

	
	static void fun(test03 t, Integer p,Integer q)
	{
		t.print(p, q);
		
	}
	
	public static void main(String[] args) 
	
	{
		
		fun((p, q)
		-> System.out.println(p+"  "+q),10,20);

	}

}
