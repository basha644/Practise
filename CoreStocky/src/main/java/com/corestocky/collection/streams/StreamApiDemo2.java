package com.corestocky.collection.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo2 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 8, 9, 4, 1, 6, 7, 2, 3, 6);

		/*
		 * This line creates a list l containing some integers using Arrays.asList()
		 * method. The list contains the integers: 1, 8, 9, 4, 1, 6, 7, 2, 3, and 6.
		 */ l.stream()

				/*
				 * This converts the list l into a stream. A stream in Java represents a
				 * sequence of elements and allows you to perform aggregate operations on them.
				 */ .sorted()

				/*
				 * This operation sorts the elements of the stream in ascending order. Since no
				 * comparator is provided, it uses natural ordering (i.e., the default ordering
				 * for the elements).
				 */ .filter(fi -> fi % 2 == 0)

				/*
				 * This operation filters the elements of the stream based on a condition. Here,
				 * it filters out only the even numbers (fi%2==0 checks if the number is
				 * divisible by 2, hence it's even).
				 */ .map(m -> m * 2)

				/*
				 * This operation transforms each element of the stream. It multiplies each
				 * element by 2, effectively doubling the value of each element.
				 */ .forEach(System.out::println);

		/*
		 * This operation performs an action for each element of the stream. Here, it
		 * prints each element to the console using System.out.println(). Putting it all
		 * together, the code first converts the list of integers into a stream, sorts
		 * them, filters out the even numbers, doubles the even numbers, and finally
		 * prints the doubled even numbers to the console.
		 * 
		 * So, when you run this code, you'll see the doubled values of the even numbers
		 * from the original list printed in ascending order.
		 */
	}

}
