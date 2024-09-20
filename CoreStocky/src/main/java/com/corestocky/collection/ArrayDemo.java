package com.corestocky.collection;

public class ArrayDemo {
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
		 * We donot have any direct class to work with data or array elements. Thuogh we have an utility class available (Arrays)
		 * We don't have any inbuilt methods like collection methods.
		 */		
		int i[]= {1,2,3,4}; 
		Integer ig[]= {1,2,3,4}; // Wrapper class
		char ch[]= new char[4];
		Object o[]= {"c,1,basha,12.3,3.45f"}; // It can store only homogenius(Same) type of data.Except object bcz object we store any type of data.
		System.out.println(i.length);// Here length is not a method.
		//System.out.println(i[6]); // java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
		
	}

}
