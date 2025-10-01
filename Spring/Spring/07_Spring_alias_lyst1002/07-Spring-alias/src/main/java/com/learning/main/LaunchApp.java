package com.learning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.Student;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Student student=factory.getBean("studentReading", Student.class);
		
		student.task();
		System.out.println(student);
		
		System.out.println();
		
		Student student2=factory.getBean("std", Student.class);
		
		student2.task();
		System.out.println(student2);
	}

}
