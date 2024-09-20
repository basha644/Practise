package com.corestocky.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {
	int empId;
	String empName;
	double empSalary;

	public Employee1(int empId, String empName, double empSalary) {
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

}

//Method1 for implementing comparator interface
class MyComparator1 implements Comparator<Employee1> {

	public int compare(Employee1 emp1, Employee1 emp2) {
		if (emp1.empId > emp2.empId)
			return +1;
        else 
		return -1;

	}

}

public class SortingDemo {
	public static void main(String[] args) {
		Employee1 e = new Employee1(44, "pavan", 123.44);
		Employee1 e1 = new Employee1(66, "rajesh", 675.44);
		Employee1 e2 = new Employee1(33, "omp", 444.44);
		Employee1 e3 = new Employee1(88, "omp", 444.44);


		List l = new ArrayList();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		System.out.println("Befor sorting");
		System.out.println(l);
		MyComparator mc = new MyComparator();
		Collections.sort(l, mc);
		System.out.println("After sorting (emp1.empId > emp2.empId) ");
		System.out.println(l);

	}

}
