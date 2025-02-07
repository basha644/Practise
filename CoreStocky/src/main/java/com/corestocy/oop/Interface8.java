package com.corestocy.oop;

/*Default methods provide a default implementation that can be overridden by implementing classes.
Static methods are called using the interface name and cannot be overridden.

Feature          	Abstract Class	                         Interface
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
You want to leverage default or static methods.*/
interface Animal2 {
    String name = "Zebra"; // Default public static final
    // Abstract method
    void sound();

    // Default method
    default void eat() {
        System.out.println("Animals eat food.");
    }

    // Static method
    static void info() {
        System.out.println("This is an Animal interface.");
    }
}

class Dog2 implements Animal2 {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("Dogs love to eat bones.");
    }
}

public class Interface8 {
    public static void main(String[] args) {
        Animal2 myDog = new Dog2();

        // Calling overridden and default methods
        myDog.sound();
        myDog.eat();
        System.out.println(Animal2.name);

        // Calling static method directly from the interface
        Animal2.info();

    }
}
