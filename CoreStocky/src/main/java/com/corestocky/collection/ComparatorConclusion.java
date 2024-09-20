package com.corestocky.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorConclusion {
	/*
	 * Note: If we are depending on default natural sorting order then the objects
	 * should be "homogeneous and comparable" otherwise we will get
	 * ClassCastException. If we are defining our own sorting by Comparator then
	 * objects "need not be homogeneous and comparable".
	 */
//	Comparable vs Comparator:
		/*For predefined Comparable classes default natural sorting order is already available if we are not satisfied with default natural sorting order then 
		 * we can define our own customized sorting order by Comparator.
		For predefined non Comparable classes [like StringBuffer] default natural sorting order is not available we can define our own sorting order by using Comparator object.
		For our own classes [like Customer, Student, and Employee] we can define default natural sorting order by using Comparable interface. The person who is using our class, 
		if he is not satisfied with default natural sorting order then he can define his own sorting order by using Comparator object.
		 */
}

class Employee implements Comparable
{
String name;
int eid;
Employee(String name,int eid)
{
	this.name=name;
	this.eid=eid;
}
public String toString()
{
	return name+"----"+eid;
}
public int compareTo(Object o)
{
	int eid1=this.eid;
	int eid2=((Employee)o).eid;
	if(eid1 < eid2)
	{
		return -1;
	}
	else if(eid1 > eid2)
	{
		return 1;
	}
	else return 0;
}
}
class CompComp
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("nag",100);
		Employee e2=new Employee("balaiah",200);
		Employee e3=new Employee("chiru",50);
		Employee e4=new Employee("venki",150);
		Employee e5=new Employee("nag",100);
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);//[chiru----50, nag----100, venki----150, balaiah----200]
		TreeSet t2=new TreeSet(new MyComparator1());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);//[balaiah----200, chiru----50, nag----100, venki----150]
	}
}
class MyComparator5 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
		}
}
