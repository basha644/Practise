package com.corestocky.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterfaceDemo2 {
//	Write a program to insert String objects into the TreeSet where the sorting order is reverse of alphabetical order.
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator2());
		t.add("Roja");
		t.add("ShobaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);//[ShobaRani, Roja, Ramulamma, RajaKumari, GangaBhavani]
	}
}
class MyComparator2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=(String)obj2;
		return s2.compareTo(s1);
//		return -s1.compareTo(s2); //[ShobaRani, Roja, Ramulamma, RajaKumari, GangaBhavani]

	}
	

}
