package com.telusko.beans;

public class QRCode implements Pay
{

	public QRCode()
	{
		System.out.println("QR cod eobj is created");
	}
	public boolean makePayment(Double amount) 
	{
		System.out.println("Payment done with QR Code for the amount :  " + amount);
		return true;
	}

}
