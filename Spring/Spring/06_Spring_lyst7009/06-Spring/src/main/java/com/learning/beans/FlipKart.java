package com.learning.beans;

import java.util.Random;

public class FlipKart 
{
	Courier courier;
   public FlipKart()
   {
	   System.out.println("target class Flipkart bj is created");
   }
	public void setCourier(Courier courier) 
	{
		this.courier = courier;
		
		
	}
	
	///Business logic
	public boolean shipment(String []item)
	{
		
		
		//System.out.println("Implementing got inject is :  " + courier.getClass().getName());
		System.out.println("The items purchased are");
		for(String elem: item)
		{
			System.out.print(elem + " , ");
		}
		System.out.println();
		 Random random=new Random();
		 int oid=random.nextInt(1000);
		courier.deliver(" "+oid);
		return true;
	}
	
	
	
	

}
