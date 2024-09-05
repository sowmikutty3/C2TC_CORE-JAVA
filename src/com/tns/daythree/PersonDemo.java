package com.tns.daythree;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        // Scanner object to accept user inputs
        Scanner ob = new Scanner(System.in);

        // Input details
        System.out.println("Enter Person Name: ");
        String name = ob.next();
        
        System.out.println("Enter Age: ");
        int age = ob.nextInt();
        
        System.out.println("Enter Gender: ");
        String gender = ob.next();
        
        System.out.println("Enter Taxable Income: ");
        int income = ob.nextInt();

        // Create Person object and initialize values
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        // Display initial person details
        System.out.println("Before tax calculation: ");
        System.out.println(person);

        // Create TaxCalculation object and calculate tax
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);

        // Display person details after tax calculation
        System.out.println("After calculating tax: ");
        System.out.println(person);

        // Close the Scanner object
        ob.close();
    }
}
