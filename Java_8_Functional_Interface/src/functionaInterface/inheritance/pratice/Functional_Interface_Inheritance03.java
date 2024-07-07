package functionaInterface.inheritance.pratice;

@FunctionalInterface
public interface Functional_Interface_Inheritance03 {

	public void first();

}

//@FunctionalInterface
//we can't use here @functionalInterface beacuse
//it's parent class have one abstract method and sub class have one interface
// but according to rule functional interface have only one abatract method
// if it is a normal interface then we can use more than one abatract method

interface Functional_Interface_Inheritance04 extends Functional_Interface_Inheritance03 {

	public void second();

	public void third();
}
