package com.corestocy.basics;

public class Loops {

// loops: same method/Functionality is need to run multiple times then we will go to
// For loop: If number of iterations(size) is fixed
// For each loop: If we need to iterate fixed no.of objects/Arrays
// While loop: If number of iterations not fixed (iterate a part of the program repeatedly until the specified Boolean condition is true)
//break: when if condition is satisfies then loop will be break and further not iterated.
// While using nested loops, it breaks the only inner loop, not outer loop.
//continue: when if condition is satisfied, then simply it not returns / skips that statement/iteration and continue remaining iterations.
    public static void main(String[] args) {
        int i = 10;
        if (i > 15) {
            System.out.println("i greaterthan 15");
            // prints statement if condition is true, skips the else and else if block
        } else if (i > 12) {
            System.out.println("i greaterthan 12");
        } else {
            System.out.println("i lessthan 10");
            // prints statement only if condition is false
        }

        for (int j = 0; j <= 5; j++) {
            System.out.println(j);
        }

        String[] ar = {"a", "b", "c"};
        for (String arr : ar) {
            System.out.println(arr);
        }

        // switch
        String course = "java";
        int fee = 0;
        switch (course) {
            case "java":
                fee = 1000;
                break;
            case "python":
                fee = 200;
                break;

        }
        System.out.println("fee: " + fee);

        //While loop
        int w = 0;
        while (w <= 5) {
            System.out.println(w);
            w++;
        }

        //break
        for (int l = 0; l < 7; l++) {
            if (l == 5) {
                System.out.println("l=5: " + l);
                break; // After if condition is satisfying then loop will be break and further not iterated.
                // While using nested loops it breaks the only inner loop not outer loop.
            }
            System.out.println(l);
        }

        //continue
        for (int j = 0; j < 10; j++) {
            if (j%2 == 0){
                continue;  // Skip even numbers
            }
            System.out.println(j);  // Prints only odd numbers
        }

        for (int k = 0; k < 5; k++) {
            System.out.println("k value: " + k);
        }
        String[] names = {"Akbar", "venkat", "vimal", "Bhaskar", "mahesh"};
        for (String name : names) {
            System.out.println("Resource name: " + name);
        }
        int x = 0;
        while (x < 10) {
            System.out.println("Iteration: " + x);
            if (x == 5) {
                break;
            }
            x++;
        }

        String horseColour = "white";
        switch (horseColour) {
            case "red":
                System.out.println("Horse price: 1cr");
            case "blue":
                System.out.println("price 50L");
            case "white":
                System.out.println("price 2L");
        }


    }
}
