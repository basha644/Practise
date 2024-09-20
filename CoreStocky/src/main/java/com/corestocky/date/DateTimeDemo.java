package com.corestocky.date;

import java.util.Date;

public class DateTimeDemo {
	
	/*
	 * java.util.Date- Used in Service class
	 * java.sql.Date- Used at DAO class 
	 * 
	 */
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		long l =d.getTime();
		System.out.println(d.getTime());
		System.out.println(d.getMonth());
		
		java.sql.Date sd =new java.sql.Date(l);
		System.out.println(sd);

	}
}
