package com.java.defaultstatic.methods;

interface Vehicles {

	default void print() {
		System.out.println("Vehicle default method");
	}
}

interface FourWheelers {
	/*default void print() {
		System.out.println("FourWheeler default method");
	}*/
	
	abstract void print();
	
}

public class Example3 implements Vehicles, FourWheelers {

	/*
	 * public void print() { System.out.println("Default class method"); }
	 */

	// Need to overide one of the interface

/*	@Override
	public void print() {
		FourWheeler.super.print();
	}*/
	
	public void print() {
		System.out.println("New default solution for one default one abstract method");
	}

	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.print();
	}

}
