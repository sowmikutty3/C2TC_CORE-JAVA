package com.tns.daytwo;





import java.util.Scanner;



public class Student {

    // Private variables (Encapsulation)

    private int rollNo;

    private String name;

    private String department;



    // Constructor to initialize the variables

    public Student(int rollNo, String name, String department) {

        this.rollNo = rollNo;

        this.name = name;

        this.department = department;

    }



    // Getter method for roll number

    public int getRollNo() {

        return rollNo;

    }



    // Setter method for roll number

    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;

    }



    // Getter method for name

    public String getName() {

        return name;

    }



    // Setter method for name

    public void setName(String name) {

        this.name = name;

    }



    // Getter method for department

    public String getDepartment() {

        return department;

    }



    // Setter method for department

    public void setDepartment(String department) {

        this.department = department;

    }



    // Overriding the toString() method to display student details

    @Override

    public String toString() {

        return "Roll No: " + rollNo + "\n" +

               "Name: " + name + "\n" +

               "Department: " + department;

    }



    // Main method to test the class

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        // Taking input from the user

        System.out.print("Enter Roll Number: ");

        int rollNo = scanner.nextInt();

        scanner.nextLine(); // Clear the buffer



        System.out.print("Enter Name: ");

        String name = scanner.nextLine();



        System.out.print("Enter Department: ");

        String department = scanner.nextLine();



        // Creating a Student object using the constructor

        Student student = new Student(rollNo, name, department);



        // Displaying initial details

        System.out.println("\nInitial Student Details:");

        System.out.println(student);



        // Modifying student details using setter methods

        System.out.print("\nEnter New Roll Number: ");

        student.setRollNo(scanner.nextInt());

        scanner.nextLine(); // Clear the buffer



        System.out.print("Enter New Name: ");

        student.setName(scanner.nextLine());



        System.out.print("Enter New Department: ");

        student.setDepartment(scanner.nextLine());



        // Displaying modified details

        System.out.println("\nModified Student Details:");

        System.out.println(student);



        // Closing the scanner

        scanner.close();

    }
}