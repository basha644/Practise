package com.corestocy.oop;

/*
* 1. Inheritance

Example: A Bird class (superclass) with attributes like color and methods like fly(). A Parrot class (subclass) inherits from Bird and adds specific attributes like canTalk and methods like speak().

Game Changer:

Code Reusability: Avoids redundant code by inheriting common properties and behaviors from a parent class.
Maintainability: Changes made to the parent class are automatically reflected in all child classes, simplifying updates.
2. Polymorphism

Example:

Method Overloading: A Calculator class with add() methods that can accept different numbers of arguments (e.g., add(int a, int b), add(int a, int b, int c)).
Method Overriding: A Shape class with an area() method. Subclasses like Circle, Rectangle, and Triangle override area() to calculate their specific areas.
Game Changer:

Flexibility: Enables objects to be treated as instances of their superclass, providing flexibility in how objects are used.
Extensibility: Allows for new classes to be added easily without modifying existing code.
3. Encapsulation

Example: A Car class with private fields like engine and fuel. Access to these fields is controlled through public getter and setter methods.

Game Changer:

Data Hiding: Protects internal data from unauthorized access or modification.
Maintainability: Changes to internal implementation can be made without affecting other parts of the code.
4. Abstraction

Example: A RemoteControl interface with methods like powerOn(), changeChannel(), and adjustVolume(). Different TV brands can implement this interface with their specific implementations.

Game Changer:

Simplicity: Hides complex implementation details, making it easier to interact with objects.
Flexibility: Allows for different implementations of the same interface, promoting loose coupling between components.*/

abstract class Shape {
    abstract void draw(); // Abstract method (nobody)

    public void info() { // Concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Abstract class cannot be instantiated
        shape.draw();
        shape.info();
    }
}

