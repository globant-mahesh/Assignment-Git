package com.corejava.assignments.lambda.functionalinterface;

public class FunctionalInterfaceExample implements sayable {
    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
        sayable.sayLouder("static");
    }

    public void say(String msg) {
        System.out.println(msg);
    }
}  

