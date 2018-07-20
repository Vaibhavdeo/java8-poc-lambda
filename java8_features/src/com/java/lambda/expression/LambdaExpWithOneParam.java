package com.java.lambda.expression;

@FunctionalInterface
interface MyFunctionalInterface2 {

	public String sayHello(String name);
}

@FunctionalInterface
interface SingleParameterInterface {

	public int squareOfFive(int s);
}

public class LambdaExpWithOneParam {

	public static void main(String[] args) {

		// 1st way
		MyFunctionalInterface2 msg = (n) -> {

			return "Hello" + n;
		};
		System.out.println(msg.sayHello("Smith"));

		// 2nd way
		MyFunctionalInterface2 msg2 = (n) -> "Hello" + n;
		System.out.println(msg2.sayHello("VD"));

		// 3rd way
		MyFunctionalInterface2 msg3 = n -> "Hello" + n;
		System.out.println(msg3.sayHello("DJ"));

	
		/*
		 * SingleParameterInterface implementation
		 */

		// 1st way
		SingleParameterInterface square = (no) -> {
			return no * no;
		};
		System.out.println(square.squareOfFive(5));

		// 2nd way
		SingleParameterInterface square2 = (no) -> no * no;
		System.out.println(square2.squareOfFive(5));

		//3rd way
		SingleParameterInterface square3 = no -> (int)Math.pow(no, 2);  //using pow function
		System.out.println(square3.squareOfFive(5));

	}

}
