package com.java.example.method.reference;

interface InstanceMethodDemo{
	
	void display();
}

public class InstanceMethodRefExample {
	
	public void display() {
		
		System.out.println("Insatnce methhod");
	}

	public static void main(String[] args) {
		
		InstanceMethodRefExample obj = new InstanceMethodRefExample();
		
		//Using lambda
		InstanceMethodDemo demo = ()->obj.display();
		demo.display();
		
		//Using Method Refernce
		InstanceMethodDemo demo2 = obj::display;
		demo2.display();
		
	}
}
