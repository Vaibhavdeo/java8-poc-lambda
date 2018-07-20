package com.java.lambda.expression;

@FunctionalInterface
interface StringConcat {

	public String stringConcat(String a, String b);
}

@FunctionalInterface
interface Addable {

	int add(int a, int b);
}

public class LamdaExpWithMultipleParams {

	public static void main(String[] args) {

		StringConcat concat = (a, b) -> {

			return a + b;
		};
		System.out.println("Concatenated String" + concat.stringConcat("Hello", "World"));

		/*
		 * Addable Interface
		 */

		Addable add = (a, b) -> {
			return a + b;
		};
		System.out.println("Addition of numbers  " + add.add(2, 3));

		//
		Addable add2 = (a, b) -> a + b;
		System.out.println("Addition of numbers  " + add2.add(2, 3));

	}
}
