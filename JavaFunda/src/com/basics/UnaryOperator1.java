package com.basics;

public class UnaryOperator1 {
	
	public static void main(String[] args) {
		
		// Unary minus(-)
		int a=10;
		int b =-a;
		int d =20;
		System.out.println("b: "+b); // b=-10
		
		// ! (NOT Operator: inverting the value of a boolean)
		// This is used to convert true to false or vice versa. Basically, it reverses the logical state of an operand.
		int c=15;
		System.out.println("(a<c): "+(a<c));
		System.out.println("!(a<c): "+!(a<c));
		
		// ~ (negating an expression)
		
		System.out.println("d: "+~d);
		System.out.println("d: "+d);

		
		
	}


}
