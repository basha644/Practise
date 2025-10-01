package com.telusko.beans;

public class Hibernate implements Course
{
//	static
//	{
//		System.out.println("Hibernate class loaded");
//	}
	public Hibernate()
	{
		System.out.println("Hibernate obj is created");
	}

	public boolean selectCourse(Double amount) 
	{
		System.out.println("Enrolled in Hibernate and amount paid is : "+ amount);
		return true;
	}

}
