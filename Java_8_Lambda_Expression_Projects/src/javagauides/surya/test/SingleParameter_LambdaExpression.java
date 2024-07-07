package javagauides.surya.test;

interface Singleparam{
	 void print(String msg);
}

public class SingleParameter_LambdaExpression {

	public static void main(String[] args) {
	
		Singleparam withLambda=msg->System.out.println(msg);
		withLambda.print("HI Java");
	}

}
