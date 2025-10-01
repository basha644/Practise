package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.CourseSelecting;

public class LaunchTest {

	public static void main(String[] args) 
	{
		//ClassPathXml
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CourseSelecting select=context.getBean("select", CourseSelecting.class); // Bean Name in applicationContext.xml:select
		
		boolean status=select.chooseCourse(500.0);
		if(status)
		System.out.println("Course purchased successfully!");
		else
			System.out.println("Failed to purchase course");
		

	}

}
