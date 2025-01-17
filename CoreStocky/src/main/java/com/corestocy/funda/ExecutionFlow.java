package com.corestocy.funda;

class Parent {
    // Static variable in Parent
    static int parentStaticVar = initializeParentStaticVar();

    // Instance variable in Parent
    int parentInstanceVar = initializeParentInstanceVar();

    // Static block in Parent
    static {
        System.out.println("Parent Static Block 3");
    }

    // Non-static block in Parent
    {
        System.out.println("Parent Non-Static Block 7");
    }

    // Parent constructor
    Parent() {
        System.out.println("Parent Default Constructor");
    }

    Parent(int x) {
        System.out.println("Parent Parameterized Constructor with value 8: " + x);
    }
    static int count = 0; // in static method static variables only allowed
    // Static method to initialize static variable
    static int initializeParentStaticVar() {
        System.out.println("Parent Static Variable Initialization 2 ");
        return 100;
    }

    // Method to initialize instance variable
    int initializeParentInstanceVar() {
        System.out.println("Parent Instance Variable Initialization 6");
        return 200;
    }
}

class Child extends Parent {
    // Static variable in Child
    static int childStaticVar = initializeChildStaticVar();

    // Instance variable in Child
    int childInstanceVar = initializeChildInstanceVar();

    // Static block in Child
    static {
        System.out.println("Child Static Block 5");
    }

    // Non-static block in Child
    {
        System.out.println("Child Non-Static Block");
    }

    // Child default constructor
    Child() {
        this(10); // Calls the parameterized constructor in Child (constructor chaining)
        System.out.println("Child Default Constructor");
    }

    // Child parameterized constructor
    Child(int x) {
        super(20); // Calls the parameterized constructor in Parent
        System.out.println("Child Parameterized Constructor with value : " + x);
    }

    // Static method to initialize static variable
    static int initializeChildStaticVar() {
        System.out.println("Child Static Variable Initialization 4");
        return 300;
    }

    // Method to initialize instance variable
    int initializeChildInstanceVar() {
        System.out.println("Child Instance Variable Initialization 9");
        return 400;
    }
}

public class ExecutionFlow {
    public static void main(String[] args) {
        System.out.println("Main Method Start 1");
        Child obj1 = new Child(); // Creating the first object
        System.out.println("----");
        Child obj2 = new Child(); // Creating the second object
        System.out.println("Main Method End");
    }
}



/*Explanation of the Execution Flow
Class Loading Phase
When the program starts, classes Parent and Child are loaded. This includes:

Initializing static variables in the order they appear in each class.
Executing static blocks in the order they appear in each class.

Order:
Parent class static variable initialization: Parent Static Variable Initialization.
Parent class static block: Parent Static Block.
Child class static variable initialization: Child Static Variable Initialization.
Child class static block: Child Static Block.
Main Method Execution
When Child obj1 = new Child(); is executed:

Parent non-static block executes.
Parent instance variable is initialized in the order it appears.
The super(20) call in Child(int x) constructor triggers the Parent(int x) constructor first.
Child non-static block executes.
Child instance variable is initialized in the order it appears.
The this(10) in the Child() constructor calls Child(int x) (chaining).
Child default constructor executes.

This example showcases:
Static initialization order: Parent static members are initialized before Child.
Non-static block and instance variable initialization: Before each constructor.
Constructor chaining and super() invocation: Demonstrated by the calls to this() and super() in Child constructors.*/

