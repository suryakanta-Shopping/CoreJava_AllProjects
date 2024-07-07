package functionaInterface.inheritance.pratice;

@FunctionalInterface
public interface Functional_Interface_Inheritance05 {

	public void first();

}

// @FunctionalInterface
// we can't use here @functionalInterface beacuse
// it's parent class have one abstract method and sub class have one interface
// but according to rule functional interface have only one abatract method
// if it is a normal interface then we can use more than one abatract method

@FunctionalInterface

//here we can use @FunctionalInterface if in the Functional_Interface_Inheritance06
// class having no abtract method
// then it will be consider both sub and super class only one abstract method

interface Functional_Interface_Inheritance06 extends Functional_Interface_Inheritance05 {

//	public void second();

//	public void third();
}
