package com.tns.dayfive.usingfinal;

// Final class cannot be inherited
final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

// Removing this class because a final class cannot be extended.
// class FinalChildClass extends FinalClass {
// }

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass(); 
		// Call show() method using object reference variable f1.
		f1.show();
	}
}
