package com.corestocy.programms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SampleProgram1 {

    public static void main(String[] args) throws IOException {
        Integer a =10;
        Integer b =20;
        String str ="akbar";
        List list = new ArrayList();
//        a = a+b-(b=a) swap two variables
        List li = List.of("akbar","basha"); // Create a List
        List<Integer> numbers = List.of(14,72,0,5,1,43);

        Math.max(a,b); // Find max of two numbers
//        Files.readAllLines(Path.of("sample.txt")); //Read all lines from file
        list.removeIf(Objects::isNull); //Remove nulls

        boolean palindromeFlag = str.equals(new StringBuilder(str).reverse().toString()); //check palindrome
        System.out.println(palindromeFlag);

        numbers.sort(Comparator.reverseOrder()); // Sort descending
        System.out.println("reverse order: "+ numbers);

        numbers.stream().filter(x-> x%2==0).count(); // count matching elements


    }
}
