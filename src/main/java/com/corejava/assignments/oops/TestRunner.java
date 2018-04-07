package com.corejava.assignments.oops;

class TestRunner {

    public static void main(String[] args) {
        Vehicle veh = new Car("Suzuki", 4, "White", "Swift");
        System.out.println("Company of the car is " + veh.getManufacturer());
        veh.getColor();

        Hatchback hatch = new Hatchback("Suzuki", 5, "NavyBlue", "Baleno");
        hatch.bootSpace(hatch.getManufacturer());
        hatch.bootSpace();
        hatch.getColor();
        System.out.println("Car has " + hatch.getColor() + " color");

        Sedan sed = new Sedan("Hyundai", 5, "Silver", "Grand i10");
        sed.bootspace();
        sed.getColor();
        System.out.println("Sedan is manufactured by " + sed.getManufacturer());

    }
}
