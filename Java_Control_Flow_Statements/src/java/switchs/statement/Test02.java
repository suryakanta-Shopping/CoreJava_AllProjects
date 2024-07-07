package java.switchs.statement;

public class Test02 {

	public static void main(String[] args) {

		Integer age = 18;

		switch (age) 
		
		{

		case (16):
			System.out.println("Not eligible for Vote");
			break;
		case (18):
			System.out.println("Eligible for Vote");
			break;
		case (65):
			System.out.println("Senior citizen");
			break;
		default:
			System.err.println("give a valid age");
			break;
		}

	}

}
