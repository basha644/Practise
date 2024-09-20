package com.corestocky.collection.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class IteratorDemo {

//	We can use Iterator to get objects one by one from any collection object.
//	We can apply Iterator concept for any collection object and it is a universal cursor.
//	While iterating the objects by Iterator we can perform both read and remove operations.
//	If a user is working with a for loop, they cannot modernize(add/remove) the Collection, whereas, if they use the Java Iterator, they can simply update the Collection.
	public static void main(String[] args) {

		List l = new ArrayList();
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i % 2 == 0)
				System.out.println(i);
			else
				itr.remove();
		}
		System.out.println(l);
		
		List<String> li =new LinkedList<String>();
		li.add("a");
		li.add("b");
		li.add("c");
		
		// In collection stack overflow problem  using with normal loop
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
//			li.add("f");  stack overflow problem 
		}
		
		// In collection ConcurrentModificationException alert  using with iteration 
		for (String s : li) {
			System.out.println(s);
//			li.add("d"); // java.util.ConcurrentModificationException  (FailFast)
		}
		
		
		//FailSafe
		CopyOnWriteArrayList co =new CopyOnWriteArrayList();
		co.add("1");
		co.add("2");
		co.add("3");
		 
				for (Object o : co) {
					System.out.println(o);
					System.out.println();
					co.add("4"); // There is no Exception  (FailSafe)

				}

	}
	
//	Limitations of Iterator:
//		Both enumeration and Iterator are single direction cursors only. That is we can always move only forward direction and we can't move to the backward direction.
//		While iterating by Iterator we can perform only read and remove operations and we can't perform replacement and addition of new objects.
//		To overcome these limitations sun people introduced listIterator concept.
	
//	ListIterator is the child interface of Iterator.
//	By using listIterator we can move either to the forward direction (or) to the backward direction that is it is a bi-directional cursor.
//	While iterating by listIterator we can perform replacement and addition of new objects in addition to read and remove operations
	
//	Iterator must be used to access the data present within the Collection. Iterator Object is invokved by calling iterator method.
//
//	FailFast: If we use Iterator to access the data present within collection and if we attempt for concurrent modification than it will lead to Exception and program will fail(No concurrent modification) 
//
//	FailSafe: If we want to achive failsafe we must use classes present in java.util.concurrent package example: CopyOnWriteArrayList and so on....
//		If concurrent modification is attempted program will fail safe without leading to an Exception ( No Exception No concurrent modification)


}
