package com.java.defaultstatic.methods;

/*
 * 
 * Static method in interface
 * 
 */
interface MyInterfaceTwo {

	default int sumDefault(int a, int b) {
		return a + b;
	}

	static int sumStatic(int a, int b) {
		return a + b;
	}

}

public class Example5 implements MyInterfaceTwo{
	
	// We can not overide static method in any class
	
	/*@Override
	static int sumStatic(int a, int b) {
		return a + b;
	}*/
	
	public static void main(String[] args) {
		
		Example5 example5 = new Example5();
		
		System.out.println(example5.sumDefault(3, 4));
		
		System.out.println(MyInterfaceTwo.sumStatic(4, 5));
		
		
	}

}
