package com.corestocky.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterfaceDemo {

//	Whenever we are implementing Comparator interface we have to provide implementation only for compare() method.
//	Implementing equals() method is optional because it is already available from Object class through inheritance.

	public static void main(String[] args) {
//		 TreeSet ts = new TreeSet(); Nothingbut  TreeSet ts = new TreeSet()
		TreeSet t = new TreeSet(new MyComparator1());

		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		System.out.println(t);// [20, 15, 10, 5, 0]
//			System.out.println(ts);//[0, 5, 10, 15, 20]

	}
	/*
	 * At line "12" if we are not passing Comparator object then JVM will always
	 * calls compareTo() method which is meant for default natural sorting
	 * order(ascending order)hence in this case the output is [0, 5, 10, 15, 20]. 
	 * At line "13" if we are passing Comparator object then JVM calls compare() method
	 * of MyComparator class which is meant for customized sorting order(descending
	 * order) hence in this case the output is [20, 15, 10, 5, 0].
	 */

}

class MyComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -100;
		else
			return 0;
		// return i1.compareTo(i2);//[0, 5, 10, 15, 20]
		// return -i1.compareTo(i2);//[20, 15, 10, 5, 0]
		// return i2.compareTo(i1);//[20, 15, 10, 5, 0]
		// return -i2.compareTo(i1);//[0, 5, 10, 15, 20]
		// return -1;//[20, 5, 15, 0, 10]//reverse of insertion order
		// return +1;//[10, 0, 15, 5, 20]//insertion order
		// return 0;//[10]and all the remaining elements treated as duplicate.

	}
}
