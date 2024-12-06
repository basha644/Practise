package com.corestocy.oop;

/*Inherited methods --> Such methods which are inherited in the child class from parent and used as it as in child class without modification.

Overridden methods --> Such methods which are inherited in child class from parent class and are modified in the child class to meet it's requirement or as per the demand in child class
        (Override will acheive by creating object like "ParentClass pc = new ChildClass()")

Specialized method --> Such methods which are present only in the child class and are not there in parent class

Rules to override a method--->>>

        -> We cannot reduce the visibility of overriden methods.However we can increase the visbility.
        -> We cannot change the return type of a overriden method in a child class.
        -> We can change the return type of a overriden method in a child class if there is Is-A relationship between return types ( co-variant return type)
-> We cannot change the argument list or parameters of a overriden method in a child class.It will be considered as overloaded method.

Key Benefits of Co-variant Return Types:
Type Safety: It eliminates the need for explicit typecasting when working with subclass-specific methods or fields.
Specialization: Allows subclass methods to provide more specific implementations, which is closer to real-world scenarios.
Flexibility: Improves readability and maintainability by enabling polymorphism with more specific return types

--> Whenever we create Object of a class , refrence variable must be of same type as that of the object.

Chid d=new Chid();

Whenever in one case refrence variable can be of diff type i.e if the refrence varibale is of Parent type then it's allowed

Parent a=new Chid();

--> Using Parent type reference, we can access inherited methods and overriden methods of a child class
however we cannot access specialized method of child class using parent reference directly.
But that can be achieved by performing Casting(Down casting);


Down casting --> Temporarily changing the behaviour from parent type to child type. ( to access specialized method of a child class)

Upcasting --> Creating parent ref for child type Object.
        Plane ref=new CargoPlane();
(To Achived polymorphism)

To Achieve Polymorphism :

We must override method to see change in behavior in the output
We must create parent type reference

Method overriding == Runtime Polymorphism
Method overloading == Compiletime Polymorphism*/

// Parent class
class Animal {
    public Animal sound() {
        System.out.println("Animals make sound");
        return new Animal();
    }
}

// Child class overriding the method
class Dog extends Animal {
    @Override
//    public Animal sound() {   old way
        public Dog sound() {    // Co-variant return type (Dog is a subclass of Animal)
            System.out.println("Dog barks");
        return new Dog();
    }

    // Act as special method not over-ride method
    public Dog sound(int num) {
        System.out.println("Act as special method");
        return new Dog();
    }

    // specialize method access child reference only
    public void walk(){
        System.out.println("Dog walking");
    }
}

public class Overriding {
    public static void main(String[] args) {

        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.sound(); // Calls overridden method in Dog class

//        myAnimal.walk();  we can't access bcz parent reference
        Dog dog = new Dog(); // Upcasting
        dog.walk();
        dog.sound(1); //special method

    }
}

