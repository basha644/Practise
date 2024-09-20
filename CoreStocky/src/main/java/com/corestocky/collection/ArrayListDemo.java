package com.corestocky.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo {
	//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable  
	
	public static void main(String[] args) {
		//ArrayList is better for storing and accessing data.
		// underlying data structure is Dynamic array (or) growable array
		//ArrayList is the best choice of "retrival operation".
		//Java ArrayList allows random access because the array works on an index basis.
		// ArrayList class is non synchronized.
		// In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
		//More suitable to perform insertion operation rear end(last end)
		
		
		List l =new ArrayList();// using l we can access only list methods.
                                // But we can override list methods.
		
		ArrayList al = new ArrayList(); 
		// using al we can access both list and arraylist methods.
		// But we can't override list methods. Bcz we taking reference as child class.
		//Default capacity:10 if reches max limit then New capacity=(current capacity*3/2)+1
		
		/*
		 * Generally collection to hold and transfer objects from one tier to another tier. 
		 * every Collection class already implements Serializable and Cloneable interfaces.
		 * ArrayList and Vector classes implements RandomAccess interface so that any random element we can access with the same speed. 
		 * Hence ArrayList is the best choice of "retrival operation".
		 * RandomAccess interface present in util package and doesn't contain any methods. It is a marker interface.
		 */		
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		
		l.add("Zebra");
		System.out.println("Ist time null alue: "+l.add(null));
		System.out.println("Duplicate value: "+l.add("Zebra"));
		System.out.println("value: "+l.add("Donkey"));
		System.out.println("2nd time null value: "+l.add(null));
		l.add("rat");
		l.add("Dog");
		System.out.println(l);
		
		
	}

}
