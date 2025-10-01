package com.learning.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.learning.beans.Student;

public class LaunchApp2 
{

	public static void main(String[] args) 
	{
		System.out.println("****Spring Core Container started****");
		//BeanFactory factory1 = new DefaultListableBeanFactory();
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContect.xml");
		
		Student student1=factory.getBean("std2", Student.class);
		System.out.println(student1);
		student1.taskOfStudent();
		
		
		System.out.println();
		System.out.println("****Spring Core Container closed****");
		
		

	}

}
