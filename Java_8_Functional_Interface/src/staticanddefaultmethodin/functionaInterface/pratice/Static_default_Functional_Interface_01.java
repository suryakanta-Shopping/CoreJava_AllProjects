package staticanddefaultmethodin.functionaInterface.pratice;

@FunctionalInterface
public interface Static_default_Functional_Interface_01 {

	public void m1(); // abstract method

	static void m2() {
	} 					// java 8 static method

	static public void m3() {
	} 					// java 8 static method

	static public void m4() {
	} 					// java 8 static method

	default void m5() {
	} 					// java 8 default method

	default public void m6() {
	} 					// java 8 default method

	default public void m7() {
	} 					// java 8 default method
}

// abstract method means which don't have body only declaration
// functional interface have only one abstract method but have
//multiple default and static method from java 8 onwords
//In functional Interface we can declare only one abatract method
//but more than one static and default method we can use