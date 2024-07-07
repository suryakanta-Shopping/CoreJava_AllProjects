package functional.interfaceBefore.java8;

public class Functional_Interface_BeforeJava8 implements Runnable {

	public static void main(String[] args) {
		Functional_Interface_BeforeJava8 ft = new Functional_Interface_BeforeJava8();

		Thread th = new Thread(ft);
		th.start();

	}

	@Override
	public void run() {

		System.out.println("Before Java 8 Functional Interface");

	}
}
