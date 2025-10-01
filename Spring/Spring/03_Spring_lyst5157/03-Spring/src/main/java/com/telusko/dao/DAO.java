package com.telusko.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DAO 
{
   public DAO()
   {
	   System.out.println("DAO Obj");
   }
   
   
   public boolean save()
   {
	   
	   System.out.println("Data is saved");
	   return true;
   }
}
