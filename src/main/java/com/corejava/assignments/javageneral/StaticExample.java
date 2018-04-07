package com.corejava.assignments.javageneral;

public class StaticExample {

    private static int myVar =10;

    public static void main(String[] args) {
        ExampleA A = new ExampleA();
        ExampleB B = new ExampleB();
        A.setVar();
        B.setVar();
        System.out.println(A.getMyVar() + " " + B.getMyVar());
    }

}

class ExampleA extends StaticExample {
//   inherited static variable is hidden
    private int myVar;
    public void setVar() {
        this.myVar =22;
    }

    public int getMyVar() {
        return myVar;
    }
}
class ExampleB extends StaticExample {
    private int myVar;
    public void setVar() {
        this.myVar = 33;
    }

    public int getMyVar() {
        return myVar;
    }
}