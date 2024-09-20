package com.oops;

public abstract class SalesmanAbstract {

	public abstract void collection();
	
	// In Abstract class we can write constructor but not object creation
	SalesmanAbstract (){
		System.out.println("Abstract class constructor");
	}

	public void camping() {
		System.out.println("campign multiple locations");

	}
	public void marketVisit() {
		System.out.println("market visit ");
	}
	
	public static void main(String[] args) {
//		SalesmanAbstract ss =new SalesmanAbstract();  we can't create object
	}

}
