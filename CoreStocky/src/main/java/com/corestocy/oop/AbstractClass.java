package com.corestocy.oop;

abstract class Shape {
    abstract void draw(); // Abstract method (no body)

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

