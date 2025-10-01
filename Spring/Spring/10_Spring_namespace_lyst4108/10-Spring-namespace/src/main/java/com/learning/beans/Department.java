package com.learning.beans;

public class Department 
{
	private Integer depNo;
	private String dName;
	@Override
	public String toString() {
		return "Department [depNo=" + depNo + ", dName=" + dName + "]";
	}

	public Department()
	{
		System.out.println("Department obj created zero param cons");
	}
	
	public Department(Integer depNo, String dName) {
		super();
		this.depNo = depNo;
		this.dName = dName;
		System.out.println("Param depart cons");
	}
	
	public void department()
	{
		System.out.println("Department behaviour is invocked");
	}
	
	

}
