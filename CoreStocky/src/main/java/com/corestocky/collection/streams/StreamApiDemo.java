package com.corestocky.collection.streams;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
	/*
	 * In Java 8, Java supports Functional prorammong with the help of Lamda Expression(->)
	 * Method Reference (System.out:: println) we can't use regularly bcz this is more of Functional programming 
	 * Here, we passing a function(println) to a another function(forEach) to achieve Functional programming 
	 */
	
	/*
	 * can we do same operations without stream usig collection?
	 * We can do but problem with garbage collector
	 * In stram there is no need to GC it will take care those things
	 */	
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,8,9,4,1,6,7,2,3,6);
		
		l.stream() // list object converts as stream 
		.sorted() // 
		.filter(fi->fi%2==0) // It filters the sorted object based on the logic
		.map(m->m*2) // It implemt the business logic for filtered one 
		.forEach(System.out::println); // Method reference it Iterate and prints the streamed object.
		
//		l.forEach(f-> System.out.println(f));  // It prints list on=bject
	}
}
