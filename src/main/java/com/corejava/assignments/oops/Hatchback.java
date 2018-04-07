package com.corejava.assignments.oops;

class Hatchback extends Car {
    //Constructor to set the properties of object
    Hatchback(String manufacturer, int noOfGears, String color, String model) {
        super(manufacturer, noOfGears, color, model);
    }

    public String getCompany() {
        System.out.println("This is hatchback car of " + getManufacturer());
        return null;
    }

    // Compile time Polymorphism
    public void bootSpace() {
        System.out.println("Bootspace for hatchback car is 20 Litres");
    }

    public void bootSpace(String model) {
        System.out.println("Bootspace for hatchback car with model " + model + " is 25 Litres");
    }
}
