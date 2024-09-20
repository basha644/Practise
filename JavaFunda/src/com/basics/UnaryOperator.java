package com.basics;

public class UnaryOperator {
	public static void main(String[] args) {
		int a = 5;

		// a++(post increment)
		// First assigns the value after that increment
		int b = a++; // b=5 , a=6

		// ++b(pre increment )
		// First increment the b value after that assign value to c
		// present b=5
		int c = ++b; // b=6, c=6

		// a--(post decrement)
		// First assigns the value after that decrement the value
		// present a=6
		int d = a--; // d=6 after a=5

		// --a(pre decrement )
		// First decrement the a value after that assign value to e
		// present a=5
		int e = --a; // a=4,e=4

		// present a=4
		// 5 5 3 3
		int f = ++a + a-- + --a + a++; // finally a=4 ,f=16

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("a: " + a + " f: " + f);

		int g = a * b;
		int h = 31;
		int i = h / 3; // 10
		int k = h % 3; // 1
		int l =~k;
		System.out.println("g: " + g);
		System.out.println("h: " + h);
		System.out.println("i: " + i);
		System.out.println("k: " + k);
		System.out.println("l: " + l);
 

	}

}
