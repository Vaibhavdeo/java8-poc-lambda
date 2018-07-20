package com.java.defaultstatic.methods;

interface MyInterface{
	
	default void newMethod() {
     
		System.out.println("Newly added default method method interface");
	}
}
public class Example1 implements MyInterface{
	
	@Override
	public void newMethod() {
		
		System.out.println("Exampe1 default method");
		
	}
	
	public static void main(String[] args) {

		Example1 example1 = new Example1();
		example1.newMethod();
	
	}

}
