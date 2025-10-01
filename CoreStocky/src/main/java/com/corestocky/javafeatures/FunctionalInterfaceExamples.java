package com.corestocky.javafeatures;

import java.util.function.Function;
import java.util.function.Predicate;


public class FunctionalInterfaceExamples {

    public static void predicateExamples(){

        Predicate<Integer> isEven = n-> n%2 == 0;
        Predicate<String> isLonger =  s -> s.length() > 5;

        System.out.println(isEven.test(10));
        System.out.println(isLonger.test("akbar basha"));

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isPositiveAndEven = isEven.and(isPositive);
        System.out.println(isPositiveAndEven.test(25));
    }

    public void functionExample(){
        Function<Integer , Integer> square = n -> n*n;
        Function<String, Integer> length = n -> n.length();

        System.out.println(length.apply("java"));
        Function<String, Integer> lengthSquare = length.andThen(square);
        System.out.println(lengthSquare.apply("java"));
    }
}
