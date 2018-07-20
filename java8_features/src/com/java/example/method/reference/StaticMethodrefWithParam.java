package com.java.example.method.reference;

interface Multiplication{
	
	int multiply(int a, int b);
}

public class StaticMethodrefWithParam {
	
	public static int multiply(int a, int b) {
		
		return a*b;
		
	}
	
public static void main(String[] args) {
	
	//Using lambda
	Multiplication multiplication = (a,b)->StaticMethodrefWithParam.multiply(a, b);
	System.out.println(multiplication.multiply(3, 5));
	
	//Using method refernce
	Multiplication multiplication2 = StaticMethodrefWithParam::multiply;
	System.out.println(multiplication2.multiply(3, 4));
	
	
}	

}
