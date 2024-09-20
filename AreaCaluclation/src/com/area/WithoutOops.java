package com.area;

import java.util.Scanner;

class Rectangle {
	public double length;
	public double breadth;
	public double area;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of Rectangle");
		length=sc.nextFloat();
		System.out.println("Please enter the breadth of Rectangle");
		breadth =sc.nextFloat();
	}
	public void compute() {
		area = length * breadth;
	}

	public void output() {
		System.out.println("Area of Rectangle is : " + area);
	}
}

class Square {
	public double length;
	public double area;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of Square");
		length =sc.nextFloat();
	}
	public void compute() {
		area = length * length;
	}

	public void output() {
		System.out.println("Area of Square is : " + area);
	}
}

class Circle {
	public double radius;
	public double area;
	public final double pi=3.14;


	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of Circle");
		radius= sc.nextFloat();
	}
	public void compute() {
		area = pi*(radius*radius);
	}

	public void output() {
		System.out.println("Area of Circle is : " + area);
	}
}
public class WithoutOops {
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.input();
		r.compute();
		r.output();
		Square s =new Square();
		s.input();
		s.compute();
		s.output();
		Circle c =new Circle();
		c.input();
		c.compute();
		c.output();
	}

}
