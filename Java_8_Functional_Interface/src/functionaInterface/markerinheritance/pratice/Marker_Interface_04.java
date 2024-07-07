package functionaInterface.markerinheritance.pratice;

public interface Marker_Interface_04 {

	
}

//we can extends functional interface from marker interface
@FunctionalInterface
interface Marker_Interface_05 extends Marker_Interface_04{
	public void m1();
	
}