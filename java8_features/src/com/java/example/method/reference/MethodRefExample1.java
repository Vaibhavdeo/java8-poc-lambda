package com.java.example.method.reference;

/*
 * Reference to a static method
 * 
 */

interface MyInterface{
	void display();
}

public class MethodRefExample1 {
	
	public static void greet() {
		
		System.out.println("Hello static method reference");
	}
	
	public static void main(String[] args) {
		
		//Using lambda expression
		MyInterface obj = ()->MethodRefExample1.greet();
		obj.display();
		
		//Using Static method reference
		
		 MyInterface obj2 = MethodRefExample1::greet;
		 obj2.display();
		}	
	
	
	
	  
}
