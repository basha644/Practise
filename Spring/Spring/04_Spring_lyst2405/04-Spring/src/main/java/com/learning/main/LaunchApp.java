package com.learning.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.learning.beans.Student;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		System.out.println("*** Spring container started ***********");
		//ClassPathXmlApplicationContext
		//ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContect.xml");
		
		//ClassPathResource
		//FileSystemResource res = new FileSystemResource("applicationContect.xml");
		Resource resource = new ClassPathResource("applicationContect.xml");
       
		
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student student1=factory.getBean("std1", Student.class);
		System.out.println(student1);
		
		System.out.println("*****************");
		
		Student student2=factory.getBean("std2", Student.class);
		System.out.println(student2);
		
		System.out.println("*****************");
		
		Student student3=factory.getBean("std3", Student.class);
		System.out.println(student3);
		
		System.out.println("*****************");
		
		Student student4=factory.getBean("std4", Student.class);
		System.out.println(student4);
		
		System.out.println();
		
		System.out.println("********Spring container stopped********");
	}

}
