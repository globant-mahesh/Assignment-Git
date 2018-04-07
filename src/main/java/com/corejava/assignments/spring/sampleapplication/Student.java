package com.corejava.assignments.spring.sampleapplication;

/**
 *
 * Aautowiring Java Bean is a java class that should follow following conventions:
 *
 * It should have a no-arg constructor.
 * It should be Serializable.
 * It should provide methods to set and get the values of the properties, known as getter and setter methods.
 *
 * There are two ways to provide values to the object of Bean, one way is by constructor and second is by setter method.
 *
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Hello: " + name);
    }
}