package com.corejava.assignments.spring.sampleapplication;

public class Aautowiring {
    Bautowiring bautowiring;

    Aautowiring() {
        System.out.println("a is created");
    }

    public Bautowiring getBautowiring() {
        return bautowiring;
    }

    public void setBautowiring(Bautowiring bautowiring) {
        this.bautowiring = bautowiring;
    }

    void print() {
        System.out.println("hello a");
    }

    void display() {
        print();
        bautowiring.print();
    }
}  
