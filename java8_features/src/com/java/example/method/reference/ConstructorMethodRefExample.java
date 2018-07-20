package com.java.example.method.reference;

interface Messageble {

	ConstructorMethodRefExample display(String msg);
}

public class ConstructorMethodRefExample {
	
	public ConstructorMethodRefExample() {
		System.out.println("Hellooo");
	}

	public ConstructorMethodRefExample(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {

		Messageble ref = (msg1) -> new ConstructorMethodRefExample(msg1);
		ref.display("Hello World");

		Messageble ref2 = ConstructorMethodRefExample::new;
		ref2.display("Hello Word2");
		
		//Signature shuuld be same
		
		/*Messageble ref3 = () -> new ConstructorMethodRefExample();
		ref.display("Hello World");*/

	}
}
