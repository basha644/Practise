package com.corestocky.collection;

import java.util.Arrays;

/*Arrays class in Java belongs to the java.util package and provides utility methods to manipulate arrays.
Its main purpose is to simplify working with arrays by providing a rich set of utility methods*/
public class ArraysDemo {
    public static void main(String[] args) {

        String[] names = {"basha","akbar","love"};
        String[] names1 = {"akbar","basha","love"};

        Arrays.asList(names);
        System.out.println(names);

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println(Arrays.equals(names,names1));

        String[] newList = Arrays.copyOf(names1, 7);
        System.out.println(Arrays.toString(newList));

        int index = Arrays.binarySearch(names1, "basha");
        System.out.println(index);

        int numbers[] = new int[5];
        Arrays.fill(numbers, 9);
        System.out.println(Arrays.toString(numbers));





    }
}
