package com.corestocy.oop;

interface Animal1 {
    void eat(); // Abstract method
    void sleep(); // Abstract method
}

class Cat implements Animal1 {
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps a lot");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal1 myCat = new Cat();
        myCat.eat();
        myCat.sleep();
        System.out.println();
        Cat mat = new Cat();
        mat.eat();
        mat.sleep();
    }
}

