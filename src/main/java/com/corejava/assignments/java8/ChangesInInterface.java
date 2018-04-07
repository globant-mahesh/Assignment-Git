package com.corejava.assignments.java8;

interface MyInterface{
    /* This is a default method so we need not
     * to implement this method in the implementation
     * classes
     */
    default void newMethod(){
        System.out.println("Newly added default method");
    }

    /* This is a static method. Static method in interface is
     * similar to default method except that we cannot override
     * them in the implementation classes.
     * Similar to default methods, we need not to implement these methods
     * in implementation classes so we can safely add them to the
     * existing interfaces.
     */
    static void anotherNewMethod(){
        System.out.println("Newly added static method");
    }

    /* Already existing public and abstract method
     * We must need to implement this method in
     * implementation classes.
     */
    void existingMethod(String str);
}

public class ChangesInInterface implements MyInterface {
    // implementing abstract method
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
    public static void main(String[] args) {
        ChangesInInterface obj = new ChangesInInterface();

        //calling the default method of interface
        obj.newMethod();
        //calling the static method of interface
        MyInterface.anotherNewMethod();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn");
    }
}

/*
With the introduction of default methods in interfaces, it seems that the abstract classes are same as interface in
java 8. However this is not entirely true, even though we can now have concrete methods(methods with body) in interfaces
 just like abstract class, this doesn’t mean that they are same. There are still few differences between them, one of
 them is that abstract class can have constructor while in interfaces we can’t have constructors.

The purpose of interface is to provide full abstraction, while the purpose of abstract class is to provide partial
abstraction. This still holds true. The interface is like a blueprint for your class, with the introduction of default
methods you can simply say that we can add additional features in the interfaces without affecting the end user classes.
 */