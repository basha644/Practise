package com.corestocky.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

class Employee {
	int empId;
	String empName;
	double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public void finalize() {
		System.out.println("Finalize method");
	}

}

public class HashmapDemo {

	public static void main(String[] args) {
		Employee e = new Employee(1, "pavan", 192.34);
		Employee e1 = new Employee(2, "sai", 123.2);
		
//		e=null; // Garbage collector will call finalize() method internally and print statement (Finalize method)
//       List<Employee> l = new ArrayList<Employee>();
//       l.add(e);
//       System.out.println(l);
//		e=null;


		WeakHashMap<Integer, Employee> hm = new WeakHashMap<Integer, Employee>();
		hm.put(123, e);
		hm.put(23, e1);
		System.out.println(hm);
e=null;
		System.gc();
		System.out.println(" Last statement");
		System.out.println(hm);

	}

	

}
