package com.corestocy.funda;

class ConstructorDemo1 extends ConstructorDemo{
	// Constructor is a one type of setter method/ No-return type of special method.
	
	/*
	 * super() - refers extend class constructor
	 * super.a - refers extend class global variable
	 * super(1,2) - refers extend class parameter constructor
	 * super.some() - refers extend class method 
	 * 
	 * this() - refers current class constructor
	 * this.a - refers current class global variable
	 * this(1,2) - refers current class parameter constructor
	 * this.some() - refers current class method
	 */
	int a;
	int b;
	
	{
		System.out.println("Block code, It is calling defaultly after super() calling berfore statements within constructor");
	}
	
	static {
		System.out.println("Static Block code, It is calling defaultly first call in stack after that other statements");
	}
 
	ConstructorDemo1() {
		// If even we are not calling super() method default it calls super() method
		// Other scenario like when we are calling this only this calling
		// So, In every constructor default first statement would be super()/this().
		System.out.println("Child class Non-parameterized construcor");
	}
	
	/*
	 * Constructor can be reffered as special type of setter whose name is same as
	 * that of a class name and it is invocked during Object creation. Also it
	 * doesn't have any explicit return type.
	 */	public ConstructorDemo1(int a, int b) {
		this();
		// Here, this.a : Refers the current class global variable
		// Right side a: Refers the local variable
		this.a = a;
		this.b = b;
		System.out.println("Child class Parameterized construcor");

	}

	@Override
	public String toString() {
		return "ConstructorDemo1 [a=" + a + ", b=" + b + "]";
	}
}

public class ConstructorDemo {
	int c;
	int d;
	
	ConstructorDemo(){
		this (1,2);
		System.out.println("Parent class Non-parameterized construcor");
	}
 
	// Constructor overloading
	public ConstructorDemo(int c, int d) {
		this.some();
		this.c = c;
		this.d = d;
		System.out.println("Parent class Parameterized construcor");
	}
	
	void some() {
		System.out.println("method calling");
	}
	

	@Override
	public String toString() {
		return "ConstructorDemo [c=" + c + ", d=" + d + "]";
	}

	public static void main(String[] args) {
		
		/* In object creation time If there is no Constructor inside a class then Java
		 * Compiler Would include a default Constructor.(Zero parameterized Constructor)
		 * - If we provided based on the constructor type(parameter/ Non-parameter)it will be initialized
		 */
		ConstructorDemo1 child = new ConstructorDemo1(2, 3);
		System.out.println(child);
		
//		ConstructorDemo parentobject = new ConstructorDemo();

	}

}
