package com.telusko.beans;

public class ProcessPayment 
{
    private Pay pay;

	public ProcessPayment(Pay pay) 
	{
		super();
		System.out.println("Constructor injection");
		this.pay = pay;
	}
	
	public boolean doPayment(Double amount)
	{
		return pay.makePayment(amount);
	}
}
