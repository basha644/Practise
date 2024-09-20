package com.basics;

public class Operators {
	public static void main(String[] args) {

		// Relational operators (comparison)
		// < > <= >= return boolean value(true/false)

		int a = 10;
		int b = 5;
		int c = 15;
		int f = 10;

		// Tenerary operator
		// condition true then take value of before semicolon otherwise after semicolon
		int d = (a > b) ? c : a;
		System.out.println("d:" + d);
		// nested if and condition
		int e = (a > b) ? (a != f ? b : c) : (a == f ? f : b);
		System.out.println("e:" + e);

	}
}
