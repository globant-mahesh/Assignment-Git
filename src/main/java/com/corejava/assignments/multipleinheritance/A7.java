package com.corejava.assignments.multipleinheritance;

class A7 implements Printable, Showable {
    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }
}  
