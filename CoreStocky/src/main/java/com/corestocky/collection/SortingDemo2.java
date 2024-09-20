package com.corestocky.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo2 {
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
		
		//Method2 for implementing comparator interface with the help of lamda expression
		Comparator<Employee1> comp =(Employee1 emp1, Employee1 emp2)->{
			if (emp2.empId>emp1.empId) {
				return 1;
			}
			else {
				return -1;
			}
		};
		
//		MyComparator mc = new MyComparator();
		Collections.sort(l, comp);
		System.out.println("After sorting (emp1.empId > emp2.empId) ");
		System.out.println(l);

	}

}
