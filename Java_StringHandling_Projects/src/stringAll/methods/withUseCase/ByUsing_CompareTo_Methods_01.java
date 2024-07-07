package stringAll.methods.withUseCase;

public class ByUsing_CompareTo_Methods_01 {

	public static void main(String[] args) {
		
		//if both the string value are equal then it retun "0"
		// otherwise it retun 
		
		
		
		String s2="java01";
		String s3="java01";
		String s4="java";
		String s5="Lipu";
		String l5="Lipu";
		String l6="lipu";

		int compareTomethod01 = s2.compareTo(s3);// Returns 0 because they are equal
		int compareTomethod02 = s2.compareTo(s4);
		int compareTomethod03 = s3.compareTo(s4);
		int compareTomethod04 = s2.compareTo(s2);// Returns 0 because they are equal
		int compareTomethod05 = s2.compareTo(s5);
		int compareTomethod06 = s5.compareTo(l5);// Returns 0 because they are equal
		int compareTomethod07 = s5.compareTo(l6);
		int compareTomethod08 = s3.compareTo(l6);
		
		System.out.println(compareTomethod01); 
		System.out.println(compareTomethod02);
		System.out.println(compareTomethod03); 
		System.out.println(compareTomethod04); 
		System.out.println(compareTomethod05); 
		System.out.println(compareTomethod06); 
		System.out.println(compareTomethod07); 
		System.out.println(compareTomethod08); 
		
		
	}

}
