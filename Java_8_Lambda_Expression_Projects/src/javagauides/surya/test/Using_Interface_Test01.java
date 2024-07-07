package javagauides.surya.test;

interface Drawable{
	public void draw();
}


public class Using_Interface_Test01 {

	
	public static void main(String[] args) {
		
		int width=10;
		
	Drawable withLambda=()->{ 
		System.out.println("val: "+width);
		
	};
		withLambda.draw();
	};
	
}
