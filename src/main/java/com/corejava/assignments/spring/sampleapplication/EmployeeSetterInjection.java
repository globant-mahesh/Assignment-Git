package com.corejava.assignments.spring.sampleapplication;

public class EmployeeSetterInjection {
    private int id;
    private String name;
    private AddressSetterInjection address;//Aggregation

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressSetterInjection getAddress() {
        return address;
    }

    public void setAddress(AddressSetterInjection address) {
        this.address = address;
    }

    void show() {
        System.out.println(id + " " + name);
        System.out.println(address.toString());
    }
}
