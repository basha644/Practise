package com.corestocy.oop;

/*Default methods provide a default implementation that can be overridden by implementing classes.
Static methods are called using the interface name and cannot be overridden.
Feature	Abstract Class	Interface

Fields/Variables	Can have instance and static variables.	 Can have only public static final constants.
Variables	        Can be private, protected, or public.	 Variables are public static final by default.
Constructors	    Can have constructors.	                 Cannot have constructors.
Abstract Methods	Can have abstract methods.	             Can have abstract methods.
Concrete Methods	Can have concrete methods.	             Can have default and static methods (Java 8+).
Static Methods	    Allowed.	                             Allowed (Java 8+).
Private Methods	    Allowed (Java 9+).	                     Allowed (Java 9+).
Methods	            Can use any access modifier.	         Methods are public by default.

When to Use What?
Use abstract classes when:
You need to share state and behavior between related classes.
You want to use protected members or constructors.
You have a strong parent-child relationship.

Use interfaces when:
You want to define a contract or capability that multiple unrelated classes can implement.
You need multiple inheritance.
You want to leverage default or static methods.
Why These Features Are Useful in Real Scenarios

Default Methods:
API maintainability: Add new features without breaking existing implementations.
Reduce code duplication by providing a shared default behavior.

Static Methods:
Framework utilities: Provide helper methods directly on the interface.
Clean organization of related utilities.

Private Methods:
Internal consistency: Reuse logic within the interface without exposing it.
Encapsulation of common logic among default or static methods.

These features, introduced in Java 8 and 9, have made interfaces much more powerful and versatile.
They now enable designing interfaces closer to abstract classes while still adhering to the multiple inheritance model.
This improves the flexibility, maintainability, and scalability of your applications.*/


// Feature 1: Abstract Class
abstract class Animal3 {
    private String name; // Feature 6: Accessibility (private field)

    public Animal3(String name) { // Constructor
        this.name = name;
    }
    {
        System.out.println("Non static block");
    }
    static {
        System.out.println(" static block");
    }

    public String getName() { // Concrete method
        return name;
    }

    public abstract void sound(); // Feature 1: Abstract method

    // Feature 4: Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Feature 2 & 3: Interface with Members
interface Flyable {
    // Feature 2: Abstract method
    void fly();

    // Feature 4: Default method
    default void takeOff() {
        System.out.println("Taking off...");
    }

    // Feature 5: Static method
    static void displayInfo() {
        System.out.println("This is the Flyable interface.");
    }

    // Feature 7: Private method (Java 9+)
    private void privateMethod() {
        System.out.println("Private method in Flyable.");
    }

    // Using the private method within a default method
    default void usePrivateMethod() {
        System.out.println("Using private method from default method:");
        privateMethod();
    }
}

// Feature 8: Multiple Inheritance with Interface
interface Swimable {
    String PET_NAME ="Dumbu";
    void swim();
}

// Concrete class inheriting abstract class and implementing multiple interfaces
class Bird extends Animal3 implements Flyable, Swimable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " chirps.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Feature 1: Abstract Class
        Bird bird = new Bird("Parrot");
        bird.sound(); // Abstract method implementation
        bird.sleep(); // Concrete method from abstract class

        // Feature 2: Interface Methods
        bird.fly(); // Abstract method from Flyable interface
        bird.takeOff(); // Default method from Flyable interface

        // Feature 3: Static Methods in Interface
        Flyable.displayInfo(); // Accessing static method in interface

        // Feature 7: Using private methods indirectly
        bird.usePrivateMethod();

        // Feature 8: Multiple Inheritance
        bird.swim(); // Method from Swimable interface
        System.out.println();
        System.out.println("public static final variable from interface "+Swimable.PET_NAME);
    }
}
