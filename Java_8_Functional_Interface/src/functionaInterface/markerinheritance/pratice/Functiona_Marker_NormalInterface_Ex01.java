package functionaInterface.markerinheritance.pratice;

interface marker_interface08 {

}

interface normal_functiona_interface10 {

	public void m1();

	public void m2();

	public void m3();
}
@FunctionalInterface
interface functional_interface10{
	
	public void m4();
//	public void m5();
}

interface normal_functiona_interface11 extends normal_functiona_interface10{
	
}

interface normal_functiona_interface12 extends marker_interface08{
	
}

interface normal_functiona_interface13 extends functional_interface10{
	
}

//@FunctionalInterface
//not possible
interface normal_functiona_interface14 extends functional_interface10{
	
	public void m6();
}

public class Functiona_Marker_NormalInterface_Ex01 {

	public static void main(String[] args) {

		
	}

}
