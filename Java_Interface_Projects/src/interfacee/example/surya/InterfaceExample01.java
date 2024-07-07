package interfacee.example.surya;

interface FirstInterface {

	public void goodMong(); //abastact function method
	
	public void goodEvng(); //abastact function method
	
	public void goodNight(); //abastact function method
}

public class InterfaceExample01 implements FirstInterface {
	
	public static void main(String[] args) {
		
		InterfaceExample01 ex=new InterfaceExample01();
		ex.goodMong();
		ex.goodEvng();
		ex.goodNight();
	}

	@Override
	public void goodMong() {
		System.out.println("Say Good Morning");
		
	}

	@Override
	public void goodEvng() {
		System.out.println("Say Good Evening");
		
	}

	@Override
	public void goodNight() {
		System.out.println("Say Good Good Night");
		
	}

}
