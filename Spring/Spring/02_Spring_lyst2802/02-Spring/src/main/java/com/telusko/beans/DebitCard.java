package com.telusko.beans;

public class DebitCard implements Pay
{
	public DebitCard()
	{
		System.out.println("Debit Card obj is created");
	}
	public boolean makePayment(Double amount) 
	{
		System.out.println("Payment done with Debit Card for the amount :  " + amount);
		return true;
	}

}
