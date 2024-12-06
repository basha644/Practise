package com.corestocy.oop;

class Calculator {
    // Overloaded methods with different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b+c;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of integers: " + calc.add(10, 20));
        System.out.println("Sum of doubles: " + calc.add(10.5, 20.3,17.5));
        System.out.println("Concatenation of strings: " + calc.add("Hello, ", "World!"));
    }
}

