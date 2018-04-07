package com.corejava.assignments.designpatterns;

/*
Mutable objects have fields that can be changed, immutable objects have no fields that can be changed after the object
is created.

A very simple immutable object is a object without any field. (For example a simple Comparator Implementation).
 */
public class Mutable {
    private int value;

    public Mutable(int aValue) {
        value = aValue;
    }

    //getter and setter for value
    public void setValue(int aValue) {
        value = aValue;
    }

    public int getValue() {
        return value;
    }
}

class ImmutableClass {

    private final int value;
    // changed the constructor to say Immutable instead of mutable
    public ImmutableClass (final int aValue) {
        //The value is set. Now, and forever.
        value = aValue;
    }

    //only getter
    public int getValue() {
        return value;
    }

}
