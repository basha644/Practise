package com.corestocky.collection;

import java.util.LinkedList;
import java.util.List;

import javax.xml.crypto.Data;

public class CollectionDemo {
public static void main(String[] args) {
		
	        //Array
			//In memory point of view Arrays are not recommended to use
			//With respect to performance Arrays are recommended to use. Bcz, here we are using Primitive datatypes(lighter) rather than wrapper classes 
			//Arrays can hold both object(Wrapper classes) and primitive data type .
	/*
		 *Array is an indexed based Data structure to store large volume of homogenous(Similar) type of data
		 *In Java, array is treated as an Object.Hence memory is allocated on Heap area
		 * Size is fixed, It cannot grow or shrink in size.
		 * If we try to change the size of an array after array declaration then new array Object will be created and old array object will neither grow or shrink.
		 * It demands Contigious memory locations.(i.e it allocates null values for remaining indexes even we are not mentioned values for indexes)
		 * We donot have any direct class to work with data or array elements. Throgh we have an utility class available (Arrays)
		 * We don't have any inbuilt methods like collection methods.
		 */		
		int i[]= {1,2,3,4}; 
		char ch[]= new char[4];
		Object o[]= {"c,1,basha,12.3,3.45f"}; // It can store only homogenous(Same) type of data.Except object bcz object we can store any type of data.
		System.out.println(i.length);// Here length is not a method.
		//System.out.println(i[6]); // java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
		
		
		
		//Collection(I)
				//In memory point of view collection are  recommended to use
				//With respect to performance collection are not recommended to use. Bcz here using wrapper classes(high weight and inbuilt methods) 
				//Collection can hold only object types but not primitive datatypes such as int, long, short, etc. 
		/*
		 * If we want to represent a group of "individual objects" as a single entity then we should go for collection.
		 * Collections are growable in nature that is based on our requirement we can increase (or) decrease the size hence memory point of view collections concept is recommended to use.
		 * Collections can hold both homogeneous and heterogeneous objects.
		 */		
		
		// Here we are using collection methods these are common for all implemented classes.
		List l = new LinkedList();
//		List<String> c = new LinkedList<String>();
		
		l.add(1);
		l.add("string");
		l.add(12.5);
		l.add(34.5f);
		l.remove(1);
//		l.clear(); // Remove aii the elements from the list
//		l.addAll(c); // Here c means another collection object reference
//		l.removeAll(c); Here, we removing data releated to collection c and retaing remaining ones.
//		l.retainAll(c); Here, we retaing data releated to collection c and removing remaining ones.
		l.isEmpty(); // checks either empty or not
		l.size();
		System.out.println(l.toArray()); //It returns object to Array
		
		
//		Collection Overview
//		In the data storing point of view
		/*
		 * ArrayList(Dynamic Array): If our requirement is keep on adding objects at the rear(last object)end.
		 * LinkedList(Doubled Linked List): If our requirement is manipulating(add objects at mid point/any point frequently) Data.
		 * 
		 */
		
//		In the data searching point of view
		/*
		 * Always prefer Treeset(Binary Search Tree) Bcz here data is setted as if value is greater than compared value it goes right side 
		 * and if value is Lesser than compared value it goes Left side. EX: LVR, LDR, LNR
		 * Due to this no.of searche is less comared to any other data structure. 
		 * If we see any other datastructures no.of search value is alwys O(n).
		 * HashSet, LinkedHashSet,Hashmap  -> HashTable(Hashing algoritham) Bcz of this no.of searches is O(1) always.  
		 */

		 
		
	}

}
