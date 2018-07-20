package com.java.defaultstatic.methods;

interface A {

	static int sumStatic(int a, int b) {

		return a + b;
	}
}

interface B {

	static int sumStatic(int a, int b) {

		return a + b;
	}
}

public class Example7 implements A, B {

	public static void main(String[] args) {

		System.out.println("Interface A static method " + A.sumStatic(5, 7));
		System.out.println("Interface A static method " + B.sumStatic(8, 7));
	}

}
