package com.java.lambda.expression;

@FunctionalInterface
interface MyFunctionalInterface {

	public void sayHello();

}

public class LamdaExpressWithNoParam {

	public static void main(String[] args) {

		/*
		 * 
		 * Annonumous Implementation
		 */
		MyFunctionalInterface obj = new MyFunctionalInterface() {

			@Override
			public void sayHello() {

				System.out.println("Hello annonymous Class");

			}
		};

		obj.sayHello();
		
		/*
		 * Functional Implementation
		 */

		MyFunctionalInterface msg = () -> {
			System.out.println("Hello Lambda1");
		};
		msg.sayHello();

		// one line expression
		MyFunctionalInterface msg2 = () -> System.out.println("Hello Lambda2");
		msg2.sayHello();
		}
	}

