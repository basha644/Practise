package com.learning.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.learning.beans.Alpha;
import com.learning.beans.Beta;

public class LaunchApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationcontext.xml");
		System.out.println("***Spring core container started*****");
		
		Alpha a=factory.getBean("al", Alpha.class);
		Beta b=factory.getBean("bt", Beta.class);
		
		
		System.out.println();
		System.out.println("***Spring core container stopped*****");
	}

}
