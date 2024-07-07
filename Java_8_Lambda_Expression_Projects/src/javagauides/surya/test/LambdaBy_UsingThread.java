package javagauides.surya.test;

public class LambdaBy_UsingThread {

	public static void main(String[] args) {
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnablw ex without Lamda exp.");
				
			}
		};
		
		Thread t1=new Thread(runnable);
		t1.start();
		
		
		//with lambda
		
		Runnable withLambda=() -> System.out.println("Runnable with Lamda Exp");
		Thread t2=new Thread(withLambda);
		t2.start();
		
	}
}
