package com.corestocy.innerclass;


public interface InterfaceDemo {
// We can extend at a time two or more interfaces there is no ambiguity/diamond problem 
//	public interface InterfaceDemo extends InterfaceDemo1,InterfaceDemo2{

	int a = 10; // deafault public static final like below
	public static final int b = 20;

	void execute(); // deafault public abstract like below

	public abstract void show();

	default void collect() {
		System.out.println("default method");
	}

	default void collect1() {
		System.out.println("default method");
	}

	static void camping() {
		System.out.println("static method");
	}

	static void camping1() {
		System.out.println("static method2");
	}

}

