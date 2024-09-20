package com.corestocy.funda;

import java.util.Scanner;

public class ArrayDemo2 {

	int a;
	int b;
	int c, d, e, f, g; // instead of this one we can use Array

	public static void main(String[] args) {
        
		// Array is an indexed based Data structure to store large volume of homogeneous(Similar) type of data.
		// while creating at that time we need to give size, otherwise syntax error.
		// DataType []arrayName=new Datatype[size];
		// Note: ar.length is not a method.
		
		int ar[] = new int[5]; // Recommended structure
		int[] t = new int[5]; // we can write but not Recommended
		int n[] = { 0, 1, 2, 3, 4 }; // At a time Array declaration with values
//		System.out.println(n.length);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter 5 values:");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Array length: "+ar.length);
		System.out.println(ar[3]);
		

	}

}
