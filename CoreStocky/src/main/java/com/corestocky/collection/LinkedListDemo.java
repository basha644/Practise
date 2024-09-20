package com.corestocky.collection;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class LinkedListDemo {
	//public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable  
	// First refer ArrayListDemo class
	public static void main(String[] args) {
		//LinkedList is better for manipulating data.
		//LinkedList : (Doubly LinkedList DS)
		//implements List and Deque interface
		//manipulation(adding/removing objects at any index) is fast because no shifting needs to occur.
		//Doubly LinkedList: A node contains a pointer to the previous as well as the next node in the sequence.
				
				
				List l =new LinkedList();// using l we can use only list methods.
		                                // But we can override list methods.
				
				LinkedList al = new LinkedList(); 
				// using al we can use both list and arraylist methods.
				// But we can't override list methods. Bcz we taking reference as child class.
				
				
				System.out.println(al instanceof Serializable);
				System.out.println(al instanceof Cloneable);
				System.out.println(al instanceof RandomAccess); // false
				
//				Usually we can use LinkedList to implement Stacks and Queues.
//				To provide support for this requirement LinkedList class defines the following 6 specific methods.
//
//				void addFirst(Object o);
//				void addLast(Object o);
//				Object getFirst();
//				Object getLast();
//				Object removeFirst();
//				Object removeLast();
				
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
