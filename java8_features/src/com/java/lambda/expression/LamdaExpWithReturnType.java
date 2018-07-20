package com.java.lambda.expression;

@FunctionalInterface
interface MyFunctionalInterface1 {

	public String sayHello();

}

public class LamdaExpWithReturnType {

	public static void main(String[] args) {

		MyFunctionalInterface1 msg = () -> {

			return "Hello Lambda1";
		};
		
		MyFunctionalInterface1 msg2 = () -> "Hello Lambda2"; //Writing a return keyword is also optional
		
		System.out.println(msg.sayHello());
		
		System.out.println(msg2.sayHello());

	}

}
