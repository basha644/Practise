package com.corestocky.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	// List(I)
	/* Null Values allowed
	 * Insertion order preserved (we can get values as in the order of inserting)
	 * Heterogeneous objects allowed
	 * Duplicate objects allowed
	 * We can differentiate duplicate objects, and we can maintain insertion order by index, hence "index play very important role in List".
	 */
	public static void main(String[] args) {
		
		// List(I) methods
		// See how in every method index plays a major role
		List l =new ArrayList ();
		List<String> c = new LinkedList<String>();
		c.add("akbar");
		c.add("basha");
		c.add("@");

		l.add(0, "basha");
		l.addAll(1, c);
		l.get(2);
		l.remove(3);
		System.out.println(l);
		System.out.println(l.listIterator(2));
		l.listIterator(2);
		System.out.println(l);
	}
}

/*1. Key Differences
Feature                 	ArrayList	                                               LinkedList
Underlying Data Structure	Resizable array	                                           Doubly linked list
Access Time             	O(1) for getting elements (index-based)	                   O(n) for getting elements (sequential traversal)
Insertion/Deletion      	Slower for large lists as it requires shifting elements	   Faster for frequent insertions/deletions at any position
Memory Usage	            Less memory overhead (no pointers required)	               More memory overhead (stores pointers to next/prev nodes)
Iteration                	Faster, as array is contiguous in memory	               Slower due to pointer hopping
Note: Contiguous in memory means, The elements are placed side by side in memory, and each element is directly accessible through its index.

Use Case	                                  ArrayList              	           LinkedList
Frequent random access (get, set)	          Preferred due to O(1) access time	   Not suitable (O(n) access time)
Frequent insertions/deletions at ends	      Suitable if at the end only	       Preferred (O(1) for both ends)
Frequent insertions/deletions in the middle	  Not efficient (requires shifting)    Efficient (pointer adjustments)
Low memory overhead required	              Better choice	                       Avoid if memory is a concern

Conclusion,
Use ArrayList when frequent access to elements is required or when memory efficiency is critical.
Use LinkedList when frequent insertions or deletions at arbitrary positions are required.
*/
