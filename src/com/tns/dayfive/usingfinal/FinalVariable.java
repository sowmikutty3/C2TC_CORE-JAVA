package com.tns.dayfive.usingfinal;

public class FinalVariable {

	// final instance variable must be initialized
	final int x = 100;

	// Declare a static blank final variable, must be initialized in a static block.
	final static int Y;

	// Declare & initialize static final variable.
	final static int Z = 10;

	// Instance method
	void change() {
		// x = 30; // This will cause a compile-time error: final variables can't be reassigned.
		// Y = 200; // This will cause a compile-time error: final static variables can't be reassigned.
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y=" + Y + "]";
	}

	// Static block to initialize the blank final static variable.
	static {
		Y = 20; // Y can only be initialized once in the static block.
		// Z = 100; // This will cause a compile-time error: final static variable Z is already initialized.
		System.out.println("Value of Y: " + Y);
		System.out.println("Value of Z: " + Z);
	}

	public static void main(String[] args) {
		// Creating an instance of the FinalVariable class
		FinalVariable fv = new FinalVariable();
		
		// Printing the values
		System.out.println(fv.toString());
	}
}
