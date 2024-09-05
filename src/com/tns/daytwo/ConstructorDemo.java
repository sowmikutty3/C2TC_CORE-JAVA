package com.tns.daytwo;

import java.util.Scanner;

public class ConstructorDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Customer input
        System.out.print("Enter Customer Id: ");
        int id = sc.nextInt();
        sc.nextLine();  // To clear the newline character
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer City: ");
        String city = sc.nextLine();
        System.out.println();

        // Create object using the default constructor
        Customer c1 = new Customer(); // Default constructor invoked
        c1.setCustomerName(name);
        c1.setCustomerId(id);
        c1.setCustomerCity(city);
        System.out.println("Customer 1 Details: " + c1);

        // Second Customer input
        System.out.print("Enter Customer Id: ");
        id = sc.nextInt();
        sc.nextLine();  // To clear the newline character
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Customer City: ");
        city = sc.nextLine();
        
        // Create object using the parameterized constructor
        Customer c2 = new Customer(name, id, city); // Parameterized constructor invoked
        System.out.println("Customer 2 Details: " + c2);

        sc.close();
    }
}
