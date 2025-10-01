package com.telusko.beans;

public class Java implements Course
{
//	static
//	{
//		System.out.println("Java class loaded");
//	}
	public Java()
	{
		System.out.println("Java Obj is created");
	}

	public boolean selectCourse(Double amount) 
	{
		System.out.println("Enrolled in Java and amount paid is : "+ amount);
		return true;
	}

}
