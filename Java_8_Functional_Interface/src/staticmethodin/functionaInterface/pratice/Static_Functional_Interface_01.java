package staticmethodin.functionaInterface.pratice;


@FunctionalInterface
public interface Static_Functional_Interface_01 {

		public void m1();  // abstract method 

		static void m2() {
		}                     //java 8 static method

		static public void m3() {
		}						 //java 8 static method

		static public void m4() {
		}						 //java 8 static method
	}

	// abstract method means which don't have body only declaration
	// functional interface have only one abstract method but have
	//multiple default and static method from java 8 onwords


