package com.corestocy.funda;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		// Mutable object. we can change in multiple time
		//Tostring method overrided
		// Generally equals method compares rfernces of the object. But in string equals method overrided. So, That why it compares the content
		// In StringBuffer & StringBuilder equals method not overrided. So, That why it compares the refernces

		
		
		StringBuffer sf =new StringBuffer();
		System.out.println(sf.capacity()); //Default capacity
		StringBuffer sf1 =new StringBuffer("akbar");
		System.out.println(sf1.capacity());
		System.out.println(sf1);
		StringBuffer sf2 =new StringBuffer("akbar");
		System.out.println(sf2);
		System.out.println(sf1.equals(sf2));
		System.out.println(sf1==sf2);
		
		sf2.append(" basha"); // akbar basha
		System.out.println(sf2);
		sf2.append(" @"); //akbar basha @ - we can change strig objct multiple times
		System.out.println(sf2);
		
		
		
		StringBuilder sb =new StringBuilder();
		System.out.println(sb);
		final StringBuilder sb1 =new StringBuilder("airtel");
		System.out.println(sb1);
		sb1.append(" revenue");
		System.out.println(sb1); //airtel revenue - Here final is not obstracted 
//		sb1= new StringBuilder("airtel"); 

		
		
		
	}

}
