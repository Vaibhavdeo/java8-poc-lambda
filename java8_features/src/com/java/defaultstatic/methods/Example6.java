package com.java.defaultstatic.methods;

/*
 * 
 * Static method in interface
 * 
 */
interface MyInterfaceOverideDemo {

	default int sumDefault(int a, int b) {
		return a + b;
	}

	static int sumStatic(int a, int b) {
		return a + b;
	}

}

public class Example6 implements MyInterfaceTwo{
	
	public int sumDefault(int a, int b) {
		return a + b-1;
	}
	// We can not overide static method in any class but we can overide default method
	
	/*@Override
	static int sumStatic(int a, int b) {
		return a + b;
	}*/
	
	public static void main(String[] args) {
		
		Example5 example5 = new Example5();
		
		System.out.println(example5.sumDefault(3, 4));
		
		System.out.println(MyInterfaceOverideDemo.sumStatic(4, 5));
		
		
	}

}
