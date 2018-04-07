package com.corejava.assignments.oops;

// Abstraction
public class Car implements Vehicle {
    //Encapsulation
    private String manufacturer;
    private String color;
    private int noOfGears;
    private String model;

    Car(String manufacturer, int noOfGears, String color, String model) {

        this.manufacturer = manufacturer;
        this.color = color;
        this.noOfGears = noOfGears;
        this.model = model;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getNoOfGears() {
        return this.noOfGears;
    }

    public String getModel() {
        return model;
    }
}
