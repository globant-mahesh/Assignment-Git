package com.corejava.assignments.lambda.functionalinterface;

@FunctionalInterface
interface sayable {
    static void sayLouder(String msg) {
        System.out.println(msg);
    }

    void say(String msg);
}  