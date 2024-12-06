package com.corestocky.javafeatures;


import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        // Example 1: Using lambda for a custom functional interface
        // A functional interface with a single abstract method
        @FunctionalInterface
        interface Greeting {
            void sayHello(String name);
        }

        // Using Lambda to implement the functional interface
        Greeting greeting = (name) -> {
            System.out.println("Hello, " + name + "!");
        };

        // Call the method
        greeting.sayHello("Alice");

        // Example 2: Sorting a list using lambda in Collections.sort
        List<String> names = Arrays.asList("Charlie", "Alice", "cat");

        names.sort(Comparator.naturalOrder());
        // Using lambda to define the comparator logic
//        Collections.sort(names, (a, b) -> a.compareTo(b));
//        Collections.sort(names, String::compareTo);
//        Collections.sort(names, Comparator.naturalOrder());
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted names in natural order: " + names);

//        Collections.sort(names, (a, b) -> b.compareTo(a));
        names.sort(Comparator.reverseOrder());

        System.out.println("Sorted names in reverse order: " + names);

        // Example 3: Using lambdas with Stream API
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using lambda to filter even numbers and print them
        numbers.stream()
                .filter(n -> n % 2 == 0)  // Lambda for filtering
                .forEach(n -> System.out.println("Even number: " + n)); // Lambda for printing

        List<Integer> num = Arrays.asList(76,0,765577,45654,2,-2);
        num.sort(Comparator.naturalOrder());
        System.out.println(num);
        num.sort(Comparator.reverseOrder());
        System.out.println(num);
    }
}

