package com.tns.dayfour.multilevelinheritance.vehicle;

public class Maruti extends Car {
	public Maruti() {
		System.out.println("Class Maruti");
	}

	public void brand() {
		System.out.println("Brand: Maruti");
	}
	public void speed() {
		System.out.println("Max: 90Kmph");
	}
}
