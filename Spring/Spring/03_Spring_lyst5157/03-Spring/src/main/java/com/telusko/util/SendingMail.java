package com.telusko.util;

import org.springframework.stereotype.Component;

@Component
public class SendingMail 
{
	public SendingMail()
	{
		System.out.println("Sending mail obj");
	}
	
	public boolean sendingMail()
	{
		System.out.println("Mail sending to user!");
		return true;
	}

}
