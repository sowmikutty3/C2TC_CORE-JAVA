package com.tns.daytwo;

public class Customer {

    // Fields for Customer details
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default constructor
    public Customer() {
        this.customerName = "Unknown";
        this.customerId = 0;
        this.customerCity = "Unknown";
    }

    // Parameterized constructor
    public Customer(String customerName, int customerId, String customerCity) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    // Getter and Setter methods
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // Overriding the toString() method to display Customer details
    @Override
    public String toString() {
        return "Customer [ID=" + customerId + ", Name=" + customerName + ", City=" + customerCity + "]";
    }
}
