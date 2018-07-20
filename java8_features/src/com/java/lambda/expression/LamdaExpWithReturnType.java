package com.java.lambda.expression;

@FunctionalInterface
interface MyFunctionalInterface1 {

	public String sayHello();

}

public class LamdaExpWithReturnType {

	public static void main(String[] args) {

		MyFunctionalInterface1 msg = () -> {

			return "Hello Lambda";
		};

		System.out.println(msg.sayHello());

	}

}
