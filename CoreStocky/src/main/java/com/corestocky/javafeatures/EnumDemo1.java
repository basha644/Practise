package com.corestocky.javafeatures;


//class EnumDemo extends Enum<Enum<E>>{
//}

enum EnumDemo {
	/*
	 * The Enum in Java is a data type which contains a fixed set of constants. Enum
	 * improves type safety Enum can be easily used in switch Enum can be traversed
	 * Enum can have fields, constructors and methods Enum may implement many
	 * interfaces but cannot extend any class because it internally extends Enum
	 * class The only difference is that enum constants are public, static and final
	 * (unchangeable - cannot be overridden).
	 */
	PASS, FAIL, ABSENT;
//	publis static final EnumDemo PASS =new EnumDemo(); //In Background above constants will be as treated as like this by JVM
//	publis static final EnumDemo FAIL =new EnumDemo(); //That's why for every constant constructor is calling
//	publis static final EnumDemo ABSENT =new EnumDemo();


	int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	EnumDemo(){
		System.out.println("EnumDemo constructor");
	}
	

}

public class EnumDemo1 {
	public static void main(String[] args) {
		EnumDemo.PASS.setMarks(35);
		int p = EnumDemo.PASS.getMarks();
		System.out.println(p);
		int f = EnumDemo.FAIL.getMarks();
		System.out.println();
	}
}
