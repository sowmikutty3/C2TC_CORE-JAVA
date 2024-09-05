package com.tns.daythree;



public class EncapsulationDemo {

    public static void main(String[] args) {
        // Object creation
        OopsConceptDemo obj = new OopsConceptDemo();

        // Setting values using setter methods
        obj.setSerialNum(101);
        obj.setName("Pooja");
        obj.setAge(20);

        // Printing object details using overridden toString() method
        System.out.println(obj);
    }
}
