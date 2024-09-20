package com.corestocy.innerclass;

public class Launch implements InterfaceDemo {
//	public class Launch2 extends Launch implements InterfaceDemo,InterfaceDemo1,InterfaceDemo2{
// We can a do at a time extend one class and implement multiple interfaces
	
	// method implementation
	@Override
	public void execute() {
		System.out.println("execute method");
	}

	@Override
	public void show() {
		System.out.println("show method");

	}

	// like that We can override Default method like
	public void collect() {
		System.out.println("Launch default method");
	}
	// Special method of this class not interface static overriding method
	static void camping() {
		System.out.println("Launch static method");
	}

	public static void main(String[] args) {
		InterfaceDemo.camping();
// Here i'm not able to access interface static method using implementing class
//		Launch.camping();     
		Launch l = new Launch();
		l.execute();
		l.show();
		l.collect();
		System.out.println(l.a);
		l.camping();

		// Here i'm not able to access interface static method using implementing class
		// object reference
		// l.camping();

	}

}
