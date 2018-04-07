package com.corejava.assignments.javageneral;

class Point {
    static int x = 2;
    int y = 4;
}

class StaticVariableHiding extends Point {
    static double x = 4.7;
    int y = 6;
    public static void main(String[] args) {
        new StaticVariableHiding().printX();
    }
    void printX() {
        System.out.println(this.x + " " + this.y + " " + super.x);
    }
}

