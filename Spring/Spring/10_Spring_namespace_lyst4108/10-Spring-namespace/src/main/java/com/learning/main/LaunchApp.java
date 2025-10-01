package com.learning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.Employee;

public class LaunchApp {

	public static void main(String[] args) 
	{
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e=factory.getBean("emp", Employee.class);
		System.out.println(e);
		e.invockDepart();
	}

}
