package com.telusko.beans;

public class CreditCard implements Pay
{
	public CreditCard()
	{
		System.out.println("Credit Card obj is created");
	}
	public boolean makePayment(Double amount) 
	{
		System.out.println("Payment done with Credit Card for the amount :  " + amount);
		return true;
	}

}
