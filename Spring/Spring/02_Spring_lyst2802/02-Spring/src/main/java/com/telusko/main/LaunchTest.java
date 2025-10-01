package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.ProcessPayment;

public class LaunchTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ProcessPayment pay=context.getBean("payment",ProcessPayment.class);
		boolean status=pay.doPayment(454.4);
		if(status)
			System.out.println("Thank you for the payment! Come again!");
		else
		System.out.println("Failed payment! You want us to show where is kitchen for the payment?");

	}

}
