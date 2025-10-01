package com.telusko.beans;

public class SpringBoot implements Course
{
//	static
//	{
//		System.out.println("SB class loaded");
//	}

	public SpringBoot()
	{
		System.out.println("Spring obj is created");
	}
	public boolean selectCourse(Double amount) 
	{
		System.out.println("Enrolled in SpringBoot and amount paid is : "+ amount);
		return true;
	}

}
