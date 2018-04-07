package com.corejava.assignments.oops;

public class Sedan extends Car {

    //Constructor to set the properties of object
    Sedan(String manufacturer, int noOfGears, String color, String model){
        super(manufacturer,noOfGears, color, model);
    }

    void bootspace() {
        System.out.println("Bootspace of Sedan is 35 Litres");
    }

}
