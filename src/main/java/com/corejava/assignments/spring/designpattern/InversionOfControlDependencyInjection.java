package com.corejava.assignments.spring.designpattern;


class Address {
}

class Employee {
    Address address;

    Employee() {
        address = new Address();
    }
}

/**
 * Java components / classes should be as independent as possible of other Java classes. This increases the possibility
 * to reuse these classes and to test them independently of other classes(Unit Testing). To decouple Java components
 * from other Java components the dependency to a certain other class should get injected into them rather that the
 * class itself creates / finds this object. Aautowiring class Aautowiring has a dependency to class Bautowiring if class uses class Bautowiring as a variable.
 * <p>
 * If dependency injection is used then the class Bautowiring is given to class Aautowiring via
 * <p>
 * the constructor of the class Aautowiring - this is then called construction injection
 * <p>
 * a setter - this is then called setter injection
 * <p>
 * The general concept between dependency injection is called Inversion of Control. Aautowiring class should not configure itself
 * but should be configured from outside. Aautowiring design based on independent classes / components increases the re-usability
 * and possibility to test the software. For example, if a class Aautowiring expects a Dao (Data Access object) for receiving the
 * data from a database you can easily create another test object which mocks the database connection and inject this
 * object into Aautowiring to test Aautowiring without having an actual database connection. Aautowiring software design based on dependency injection
 * is possible with standard Java. Spring just simplifies the use of dependency injection by providing a standard way of
 * providing the configuration and by managing the reference to the created objects.
 *
 * In Spring framework, IOC container is responsible to inject the dependency. We provide metadata to the IOC container either by XML file or annotation.
 *
 * Advantage of Dependency Injection
 * 1. makes the code loosely coupled so easy to maintain
 * 2. makes the code easy to test
 */
public class InversionOfControlDependencyInjection {
    Address address;

    InversionOfControlDependencyInjection(Address address) {
        this.address = address;
    }
}