package com.corestocky.collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArrayasListDemo {
	public static void main(String[] args) {
		/*
		 * Old Type Array list object declaration
		 */
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(34);
		l.add(67);
		System.out.println(l);

		for (Integer i : l) {
			System.out.println(i);
		}

		/*
		 * Latest Arrays.asList Procedure
		 */
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(li);

		for (Integer i : li) {
			System.out.println(i);
		}

		/*
		 * Old method procedure
		 */
		System.out.println("Consumer interface implementation with the help of anonymous Inner class");
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer li) {
				System.out.println(li);
			}

		};
		li.forEach(c);

		/*
		 * Old method procedure2
		 */
		System.out.println("Consumer interface implementation");
		Consumer<Integer> co = (Integer i) -> System.out.println(i);
		li.forEach(co);

		/*
		 * Latest Procedure
		 */
		System.out.println("Latest Procedure For each method");
		li.forEach(f -> System.out.println(f));

	}

}
