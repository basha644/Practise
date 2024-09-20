package com.corestocy.innerclass;

public class Launch2 implements InterfaceDemo,InterfaceDemo1 {

	// method implementation
	@Override
	public void execute() {
		System.out.println("execute method");
	}

	@Override
	public void show() {
		System.out.println("show method");

	}

//	// like that We can override Default method like
//	public void collect() {
//		System.out.println("Launch default method");
//	}

	@Override
	public void collect() {
		InterfaceDemo1.super.collect(); 	// Bcz of same default methods are available in two interfaces
	}

	// Special method of this class not interface static overriding method
	static void camping() {
		System.out.println("Launch static method");
	}

	public static void main(String[] args) {
		InterfaceDemo.camping();
// Here i'm not able to access interface static method using implementing class
//		Launch.camping();     
		Launch2 l = new Launch2();
		l.execute();
		l.show();
		l.collect();
		// While calling this variable with object reference wii  happen ambiguity problem Because same variable is avilable two interfaces
//		System.out.println(l.a);
		// I can able to access extended interface variable value, But can't access
		// override variable "a=60"
		System.out.println(l.c);
		l.camping();

		// Here i'm not able to access interface static method using implementing class
		// object reference
		// l.camping();

	}

}
