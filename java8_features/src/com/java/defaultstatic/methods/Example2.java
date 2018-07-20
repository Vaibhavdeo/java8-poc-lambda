package com.java.defaultstatic.methods;

interface Vehicle {

	default void print() {
		System.out.println("Vehicle default method");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("FourWheeler default method");
	}
}

public class Example2 implements Vehicle, FourWheeler {

	/*
	 * public void print() { System.out.println("Default class method"); }
	 */

	// Need to overide one of the interface

	@Override
	public void print() {
		FourWheeler.super.print();
	}

	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.print();
	}

}
