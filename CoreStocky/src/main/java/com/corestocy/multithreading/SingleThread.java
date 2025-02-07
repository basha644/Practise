package com.corestocy.multithreading;

import java.util.Scanner;

public class SingleThread {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("until entering age it will go with next step, This is called single Threading.");
        System.out.println("age: ");
        int age = sc.nextInt();
        System.out.println("number: ");
        int number = sc.nextInt();

        Thread t = Thread.currentThread();
        System.out.println(t.getName());// main
        System.out.println(t.getPriority()); //5
        System.out.println();

        t.setName("Basha");
        t.setPriority(10);
        System.out.println(t.getName()); //Basha
        System.out.println(t.getPriority()); //10

    }
}
