package java.ifElseifLadder.statement;

public class Test01 {

	public static void main(String[] args) {

		// declare a variable
		int marks = 65;

		// here we checking the marks with if and else if condition

		// if we want check more than one condition we will use this if and else id

		if (marks < 50) // checks if condition is true
		{
			System.out.println("fail");
		} else if (marks >= 50 && marks < 60) // checks if previous condition is false

		{
			System.out.println("Grade C");
		} else if (marks >= 60 && marks < 70) // checks if previous condition is false

		{

			System.out.println("Grade B");
		}

		else {
			System.out.println("Grade A");
		}

	}

}
