package com.corestocky.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	// List(I)
	/* Null Values allowed
	 * Insertion order preserved (we can get values as in the order of inserting)
	 * Heterogenous objects allowed
	 * We can differentiate duplicate objects and we can maintain insertion order by means of index hence "index play very important role in List".
	 */
	public static void main(String[] args) {
		
		// List(I) methods
		// See how in every method index plays major role
		List l =new ArrayList ();
		List<String> c = new LinkedList<String>();
		c.add("akbar");
		c.add("basha");
		c.add("@");

		l.add(0, "basha");
		l.addAll(1, c);
		l.get(2);
		l.remove(3);
		System.out.println(l.listIterator(2));
		l.listIterator(2);
		System.out.println(l);
		
		
		
		
		
		
	}

}
