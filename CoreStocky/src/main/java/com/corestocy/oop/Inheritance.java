package com.corestocy.oop;

/*Inherited methods --> Such methods which are inherited in the child class from parent and used as it as in child class without modification.

Overridden methods --> Such methods which are inherited in child class from parent class and are modified in the child class to meet it's requirement or as per the demand in child class
        (Override will acheive by creating object like "ParentClass pc = new ChildClass()")

Specialized method --> Such methods which are present only in the child class and are not there in parent class

Rules to override a method--->>>

        -> We cannot reduce the visibility of overriden methods.However we can increase the visbility.
        -> We cannot change the return type of a overriden method in a child class.
        -> We can change the return type of a overriden method in a child class if there is Is-A relationship between return types ( co-variant return type)
-> We cannot change the argument list or parameters of a overriden method in a child class.It will be considered as overloaded method.*/

// Parent class
class Vehicle {
    protected String brand = "Generic Vehicle"; // Protected access allows child classes to access

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S");
        myCar.start(); // Inherited method
        myCar.displayInfo(); // Method from Car class
    }
}



