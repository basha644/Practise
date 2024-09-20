package com.oops;

class ExecutionFlow1 {
	static int a, b;

	int x, y;
	static int z=100;

	static {
		a = 10;
		b = 20;
		System.out.println("Static block");
	}

	{
		x = 10;
		y = 20;
		System.out.println("Non Static block/Java Block");
	}

	public ExecutionFlow1() {
//		{
//			x=10;
//			y=20;
//			System.out.println("Non Static block/Java Block");
//		}
		System.out.println("Constructor");
	}

	public static void disp() {
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
		
	}

	public void disp2() {
		System.out.println("Value of x : " + a);
		System.out.println("Value of y : " + y);
	}

	public static void main(String[] args) {
		disp();
//		ExecutionFlow1.z;
//		System.out.println("value:"+ExecutionFlow1.z );

		// ExecutionFlow1.disp2();
//
//		ExecutionFlow1 d = new ExecutionFlow1();
//		d.disp2();
		// d.disp();

	}

}
