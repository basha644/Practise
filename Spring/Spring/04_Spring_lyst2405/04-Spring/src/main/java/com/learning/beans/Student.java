package com.learning.beans;

//TargetObject
public class Student 
{
	
	private Integer id;
	private String name;
	private String addr;
	private Float avg;
	
	static 
	{
		System.out.println("Student.class is loading...");
	}
	
	//Constructor Injection
	public Student(Integer id, String name, String addr, Float avg) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.avg = avg;
		
		System.out.println("Param constructor invocked==> Student obj is created");
	}

     public String taskOfStudent()
     {
    	 
    	 System.out.println("Ever Human being is lifetime Student");
    	 return "learning is contiguous process";
     }


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + ", avg=" + avg + "]";
	}
	
	
	

}
