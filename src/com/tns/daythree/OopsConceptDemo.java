package com.tns.daythree;

public class OopsConceptDemo {

    // Private fields for encapsulation
    private int serialNum;
    private String name;
    private int age;

    // Getter and Setter for serialNum
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding toString() method to provide a string representation of the object
    @Override
    public String toString() {
        return "OopsConceptDemo [Serial Number=" + serialNum + ", Name=" + name + ", Age=" + age + "]";
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an object of OopsConceptDemo
        OopsConceptDemo demo = new OopsConceptDemo();
        
        // Set values using setter methods
        demo.setSerialNum(101);
        demo.setName("John Doe");
        demo.setAge(25);
        
        // Output the object's state using the toString() method
        System.out.println(demo.toString());
    }
}
