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
	// Non-static block
	{
		System.out.println("Block code, It is calling default after super() calling before statements within constructor");
	}
	
	static {
		System.out.println("Static Block code, It is calling default first call in stack after that other statements will be execute");
	}
 
	ConstructorDemo1() {
		// If even we are not calling super() method default it calls super() method
		// Other scenario like when we are calling this() only this calling (any one only will be available super()/this())
		// So, In every constructor defaultly  first statement would be super()/this().

		System.out.println("Child class Non-parameterized constructor");
	}
	
	/*
	 * Constructor can be referred as a special type of setter whose name is same as
	 * that of a class name, and it is invoked during Object creation. Also, it
	 * doesn't have any explicit return type.
	 */	public ConstructorDemo1(int a, int b) {
		this();
		// Here, this.a : Refers the current class global variable
		// Right side a: Refers the local variable
		this.a = a;
		this.b = b;
		System.out.println("Child class Parameterized constructor");

	}

	//toString Override other wise it is default prints object address
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
		System.out.println("Parent class Non-parameterized constructor");
	}
 
	// Constructor overloading
	public ConstructorDemo(int c, int d) {
		this.some();
		this.c = c;
		this.d = d;
		System.out.println("Parent class Parameterized constructor");
	}
	
	void some() {
		System.out.println("method calling inside Parameterized constructor");
	}
	

	@Override
	public String toString() {
		return "ConstructorDemo [c=" + c + ", d=" + d + "]";
	}

	public static void main(String[] args) {
		
		/* In object creation time, If there is no Constructor inside a class, then Java
		 * Compiler Would include a default Constructor.(Zero parameterized Constructor)
		 * - If we provided based on the constructor type(parameter/ Non-parameter)it will be initialized
		 */
		ConstructorDemo1 child = new ConstructorDemo1(2, 3);
		System.out.println(child);
		System.out.println();

		ConstructorDemo1 child1 = new ConstructorDemo1();

		System.out.println();
		System.out.println("child 1 object a value: "+child1.a);
		System.out.println(" like child1 for object separate set of default/ initialized values will allocate");
		System.out.println("child 1 object b value: "+child1.b);


//		ConstructorDemo parent object = new ConstructorDemo();

	}

}
