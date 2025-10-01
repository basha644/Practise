package com.learning.beans;

import java.util.Date;

public class Employee 
{
	private Integer id;
	private String name;
	private Integer age;
	
	private Department depart;
	
	private Date dob;
	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Employee()
	{
		System.out.println("Employee obj created zero param cons");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public void setDepart(Department depart) {
		this.depart = depart;
	}

    public void invockDepart()
    {
    	depart.department();
    }


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", depart=" + depart + "]";
	}

}
