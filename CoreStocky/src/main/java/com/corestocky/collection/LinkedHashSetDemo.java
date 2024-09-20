package com.corestocky.collection;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
//	public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable  

	
//	The underlying data structure is a combination of LinkedList and Hashtable.
//	Insertion order is preserved.
//	 LinkedHashSet class contains unique elements only like HashSet.
//	If we are trying to insert duplicate objects we won't get compile time error and runtime error add() method simply returns false.
//	LinkedHashSet allows null value.(only once)
//	LinkedHashSet class is non synchronized.
//	The initial default capacity of HashSet is 16, and the load factor is 0.75.
	
	
//	Same as Hashtable with some changes that are
//	The underlying data structure is a combination of LinkedList and Hashtable.
//	Insertion order is preserved.
	



	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Zebra");
		System.out.println("Ist time null alue: "+hs.add(null));
		System.out.println("Duplicate value: "+hs.add("Zebra"));
		System.out.println("value: "+hs.add("Donkey"));
		System.out.println("2nd time null value: "+hs.add(null));
		hs.add("rat");
		hs.add("Dog");
		System.out.println(hs);

//		[null, rat, Zebra, Donkey, Dog]  Hashset result
//		[Zebra, null, Donkey, rat, Dog]  LinkedHashSet result


		/*
		 * Note: Keeping the insertion order in the LinkedHashset has some additional
		 * costs, both in terms of extra memory and extra CPU cycles. Therefore, if it
		 * is not required to maintain the insertion order, go for the lighter-weight
		 * HashMap or the HashSet instead.
		 * Note: LinkedHashSet and LinkedHashMap commonly used for implementing "cache applications"
		 *  where insertion order must be preserved and duplicates are not allowed.
		 */
	}

}
