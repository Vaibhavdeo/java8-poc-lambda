package com.java.example.method.reference;

interface MathOperation{
	
	int addition(int a, int b);
}

public class InstanceMethodRefWithParam {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		InstanceMethodRefWithParam obj = new InstanceMethodRefWithParam();
		
		//Using lambda
		MathOperation op = (a,b)->obj.add(a, b);
		System.out.println(op.addition(3, 4));
		
		//Using Method Ref
		MathOperation op2 = obj::add;
		System.out.println(op2.addition(3, 4));
	}

}
