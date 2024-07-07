package functionaInterface.inheritance.pratice;

@FunctionalInterface
public interface Functional_Interface_Inheritance01 {

	public void first();

}

//@FunctionalInterface
//we can't use here @functionalInterface beacuse
//it's parent class have one abstract method and sub class have one interface
// but according to rule functional interface have only one abatract method

interface Functional_Interface_Inheritance02 extends Functional_Interface_Inheritance01 {

	public void second();
}
