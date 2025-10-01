package com.telusko.service;

import org.springframework.stereotype.*;

@Component
public class Service {
	
	public Service()
	{
		System.out.println("Service obj");
	}
	
	public boolean service()
	{
		System.out.println("Some service i m gonna provide");
		return true;
	}

}
