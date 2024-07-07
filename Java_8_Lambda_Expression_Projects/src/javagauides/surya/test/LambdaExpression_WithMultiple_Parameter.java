package javagauides.surya.test;

interface Calculator {
	int cal(int a, int b);

}

public class LambdaExpression_WithMultiple_Parameter {

	public static void main(String[] args) {

		Calculator withlabda = (a, b) -> (a + b);
		System.out.println("Addition Value: " + withlabda.cal(10, 20));

		Calculator values = (a, b) -> (a + b);
		System.out.println("Addition Value: " + values.cal(10, 200));

		Calculator sub = (a, b) -> (a - b);
		System.out.println("Sub Value: " + sub.cal(50, 20));

		Calculator mul = (a, b) -> (a * b);
		System.out.println("Mul Value: " + mul.cal(2, 5));

		Calculator div = (int c, int d) -> (c / d);
		System.out.println("Division Value :" + div.cal(100, 10));

	}
}
