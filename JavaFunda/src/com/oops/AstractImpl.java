package com.oops;

public class AstractImpl extends SalesmanAbstract {

	@Override
	public void collection() {
		System.out.println("collected amount");
	}
	
	public void marketVisit() {
		System.out.println("market visit done");
	}
	public static void main(String[] args) {
		SalesmanAbstract s =new AstractImpl();
		s.marketVisit();
		s.collection();
	}
	

}
