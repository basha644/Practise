package com.corestocy.innerclass;

public interface InterfaceDemo2 {

	int a = 60;
	int c = 60;


	default void collect() {
		System.out.println("InterfaceDemo1 default method");
	}
	
	static void camping() {
		System.out.println("InterfaceDemo1 static method");
	}

}
