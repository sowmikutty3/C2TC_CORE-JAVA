package com.tns.dayfive.usingfinal;

// Superclass with a final method
class FinalMethodClass {
	// Constructor
	FinalMethodClass() {
		System.out.println("This is a default constructor of FinalMethodClass");
	}

	// Final method
	final void show() {
		System.out.println("This is a final method from FinalMethodClass");
	}
}

// Subclass trying to extend the class
public class FinalMethodClassTest extends FinalMethodClass {
	// Cannot override the final method 'show()' from the parent class.
	// Uncommenting the below method will lead to a compile-time error.

	/*
	@Override
	void show() {
		System.out.println("This is the final method of FinalMethodEx class");
	}
	*/

	public static void main(String[] args) {
		// Creating an object of FinalMethodClassTest (child class)
		FinalMethodClassTest obj = new FinalMethodClassTest();
		
		// Calling the final method inherited from the parent class
		obj.show(); // Calls the inherited final method from FinalMethodClass
	}
}
