package com.corestocky.collection;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
//	public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable  

	
//	The underlying data structure is Hashtable. ???????????
//	HashSet stores the elements by using a mechanism called hashing.
//	HashSet contains unique elements only.(Duplicates not allowed)
//	If we are trying to insert duplicate objects we won't get compile time error and runtime error add() method simply returns false.
//	HashSet allows null value.(only once)
//	HashSet class is non synchronized.
//	HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//	HashSet is the best approach for search operations.  ??????????
//	The initial default capacity of HashSet is 16, and the load factor is 0.75.
// Here we can't predict the output.

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Zebra");
		System.out.println("Ist time null alue: "+hs.add(null));
		System.out.println("Duplicate value: "+hs.add("Zebra"));
		System.out.println("value: "+hs.add("Donkey"));
		System.out.println("2nd time null value: "+hs.add(null));
		hs.add("rat");
		hs.add("Dog");
		System.out.println(hs);//[null, rat, Zebra, Donkey, Dog]


		

	}

}
