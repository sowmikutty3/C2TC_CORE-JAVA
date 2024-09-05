package com.tns.daythree;

public class TaxCalculation {
    
    // Method to calculate tax based on income
    public void calculateTax(Person person) {
        int income = person.getIncome();
        double tax;
        
        // Simple tax calculation logic (adjust as per requirements)
        if (income <= 25000) {
            tax = 0;
        } else if (income <= 50000) {
            tax = income * 0.10;
        } else {
            tax = income * 0.20;
        }
        
        // Set the calculated tax to the Person object
        person.setTax(tax);
    }
}
