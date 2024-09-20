package com.corestocky.collection;

import java.util.TreeSet;

public class TreeSetDemo {
// Binary search tree (DS)
//	public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>(SortedSet), Cloneable, Serializable
//	null value not allowed
	
	
//	The underlying data structure is balanced tree.
//	Duplicate objects are not allowed.
//	Insertion order is not preserved and it is based on some sorting order of objects.
//	Heterogeneous objects are not allowed if we are trying to insert heterogeneous objects then we will get ClassCastException.
//	Null insertion is possible(only once).

//	TreeSet t=new TreeSet();
//	Creates an empty TreeSet object where all elements will be inserted according to default natural sorting order.
//	TreeSet t=new TreeSet(Comparator c);
//	Creates an empty TreeSet object where all objects will be inserted according to customized sorting order specified by Comparator object.
//	TreeSet t=new TreeSet(SortedSet s);
//	TreeSet t=new TreeSet(Collection c);
	
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("Zebra");
//		System.out.println("Ist time null alue: "+ts.add(null));  java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
		System.out.println("Duplicate value: "+ts.add("Zebra"));
		System.out.println("value: "+ts.add("Donkey"));
//		System.out.println("2nd time null value: "+ts.add(null));  java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
		ts.add("rat");
		ts.add("Dog");
		System.out.println(ts);
		
//		ts.add(new StringBuffer("basha"));  java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.StringBuffer 

//		Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
//		If we are depending on default natural sorting order compulsory the objects should be homogeneous and Comparable otherwise we will get ClassCastException.
//		An object is said to be Comparable if and only if the corresponding class implements Comparable interface.
//		String class and all wrapper classes implements Comparable interface but StringBuffer class doesn't implement Comparable interface hence in the above program we are getting ClassCastException.
	}

}
