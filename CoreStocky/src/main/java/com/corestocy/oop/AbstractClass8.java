package com.corestocy.oop;

/*Static methods belong to the abstract class and cannot be overridden.
Default methods in abstract classes are the same as concrete methods.
-->An abstract class can have a Constructor. This Constructor would be invovked using super() call present in the child class Constructor.
-->Constructor cannot be abstract bcz in every constructor we have either super() or this().*/
abstract class Vehicle1 {
    // Abstract method
    abstract void move();
    Vehicle1(){
        System.out.println("parent constructor");
    }

    // Default method (concrete method with implementation)
    public void fuelType() {
        System.out.println("Most vehicles run on petrol or diesel.");
    }

    // Static method
    public static void info() {
        System.out.println("Vehicles are used for transportation.");
    }
}

class Car1 extends Vehicle1 {
    @Override
    void move() {
        System.out.println("The car moves on four wheels.");
    }

    @Override
    public void fuelType() {
        System.out.println("Cars usually run on petrol, diesel, or electricity.");
    }
    public static void info() {
        System.out.println("Vehicles are used for going tour.");
    }
}

public class AbstractClass8 {
    public static void main(String[] args) {
        Vehicle1 myCar1 = new Vehicle1() {
            @Override
            void move() {
                System.out.println("object creation with abstract class");
            }
        };
        myCar1.move();
        System.out.println();
        Vehicle1 myCar = new Car1();

        // Calling overridden and default methods
        myCar.move();
        myCar.fuelType();

        // Calling static method directly from the abstract class
        Vehicle1.info();
        Car1.info();
    }
}


