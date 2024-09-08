package com.tns.dayfive.usingfinal;

// Class with final method
class FinalMethodClass {
	// Constructor
	FinalMethodClass() {
		System.out.println("This is a default constructor");
	}

	// Final variable
	final int a = 50;

	// Final method
	final void show() {
		System.out.println("Value of a: " + a);
	}
}

public class FinalMethodDemo {
	public static void main(String[] args) {
		// Creating an object of FinalMethodClass
		FinalMethodClass obj = new FinalMethodClass();
		
		// Calling the final method show()
		obj.show();
	}
}
