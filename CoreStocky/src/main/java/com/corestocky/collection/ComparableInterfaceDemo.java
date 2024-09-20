package com.corestocky.collection;

import java.util.TreeSet;

public class ComparableInterfaceDemo {
	
//	Comparable interface present in java.lang package and contains only one method compareTo() method.
//	obj1.compareTo(obj2);
	/*
	 * Note: String class and Wrapper classes implement the Comparable interface by
	 * default. So if you store the objects of string or wrapper classes in a list,
	 * set or map, it will be Comparable by default.
	 */	
	public static void main(String[] args) 
	{
		System.out.println("A".compareTo("Z"));//-25
		System.out.println("Z".compareTo("K"));//15
		System.out.println("A".compareTo("A"));//0
		System.out.println("A".compareTo("C")); //-2  negative integer because "A" comes before "C" 
		System.out.println("C".compareTo("A")); //2
		//System.out.println("A".compareTo(new Integer(10)));
		     //Test.java:8: compareTo(java.lang.String) in java.lang.String cannot be applied to (java.lang.Integer)
		//System.out.println("A".compareTo(null));//NullPointerException
		
//		If we are depending on default natural sorting order then internally JVM will use compareTo() method to arrange objects in sorting order.
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t);//[0, 10, 15]
		
//		If we are not satisfying with default natural sorting order (or) if default natural sorting order is not available then we can define our own customized sorting by Comparator object.
//		Comparable meant for default natural sorting order.
//		Comparator meant for customized sorting order.
		
	}

}
