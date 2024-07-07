package defaultmethodin.functionaInterface.pratice;

@FunctionalInterface
public interface Default_Functional_Interface_01 {

	public void m1();  // abstract method 

	default void m2() {
	}                     //java 8 default method

	default public void m3() {
	}						 //java 8 default method

	default public void m4() {
	}						 //java 8 default method
}

// abstract method means which don't have body only declaration
// functional interface have only one abstract method but have
//multiple default and static method from java 8 onwords
