package com.java.defaultstatic.methods;

interface MyInterfaceDemo{
	
	default void newMethod() {
		
		System.out.println("Interface Method");
		
	}
}
 abstract class ExampleAbstract implements MyInterfaceDemo {
	
	public abstract void newMethod() ;

}
 
 public class Example4 extends ExampleAbstract{
	 
	 @Override
		public void newMethod() {
			System.out.println("Overide in Example4");
			
		}
	 public static void main(String[] args) {
		 Example4 example4 = new Example4();
		 
		 example4.newMethod();
		
	}

	
	 
 }
