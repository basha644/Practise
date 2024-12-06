package com.corestocy.funda;

/*An array in Java is a collection of elements of the same data type stored in contiguous memory locations.
Arrays are used to store multiple values in a single variable instead of declaring separate variables for each value.
Key Features of Arrays in Java
Fixed Size: Once created, the size of an array cannot be changed.
Indexed Access: Elements in an array are accessed using their index, which starts at 0.
Homogeneous Elements: All elements in an array must be of the same data type.
Efficient Access: Provides quick access to elements due to contiguous memory allocation.*/

import java.util.Arrays;
import java.util.List;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // Step 1: Declare and initialize an array
        int[] numbers = {90, 20, 830, 105, 21}; // Array of 5 integers

        // Step 2: Access array elements using their index
        System.out.println("First Element: " + numbers[0]); // Output: 10
        System.out.println("Third Element: " + numbers[2]); // Output: 30

        // Step 3: Update an element
        numbers[2] = 35; // Changing the value at index 2
        System.out.println("Updated Third Element: " + numbers[2]); // Output: 35

        // Step 4: Loop through the array
        System.out.println("All Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // Print each element
        }

        // opearations with array
        /*  Arrays
       This class is a member of the Java Collections Framework.
        This class contains various methods for manipulating arrays (such as sorting and searching).*/

        System.out.println("length of an array: "+ numbers.length);  // Length is an property not a method

        System.out.println("Retrieve value based on index number: "+numbers[2]);

//        List li = Arrays.asList(numbers);
        List li = List.of(numbers);

        System.out.println("list of array: "+li);

        int[] copyArray = Arrays.copyOf(numbers, numbers.length+2); // copy an array from existing with array size increase
        for(int call : copyArray)
            System.out.print(call);
        System.out.println();

        Arrays.sort(copyArray); // sorting array in ascending
        for(int sort: copyArray)
            System.out.println(sort);

        int index = Arrays.binarySearch(copyArray,105); //Searching an Array: Use Arrays.binarySearch for sorted arrays.
        System.out.println("Retrieve index number based on value using Arrays class and sorting: "+index);


    }
}

