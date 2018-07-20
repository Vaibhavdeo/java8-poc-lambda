package com.java.example.method.reference;

interface Messageble{
	
	ConstructorMethodRefExample display(String msg);
	
}

public class ConstructorMethodRefExample {
	
	ConstructorMethodRefExample(String msg){
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		
		Messageble ref = (msg1)->new ConstructorMethodRefExample(msg1);
		ref.display("Hello World");
		
		Messageble ref2 = ConstructorMethodRefExample::new;
		ref2.display("Hello Word2");
		
	}

}
