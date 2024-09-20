package com.area;

import java.util.Scanner;

abstract class  Shape{
	public double area;
	public abstract void input();
	public abstract void compute() ;
	public void output() {
		System.out.println("Area is : " + area);
	}
	

}

class Rectangle1 extends Shape{
	public double length;
	public double breadth;

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

}

class Square1 extends Shape {
	public double length;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of Square");
		length =sc.nextFloat();
	}
	public void compute() {
		area = length * length;
	}

}

class Circle1 extends Shape {
	public double length;
	public final double pi=3.14;


	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of Circle");
		length= sc.nextFloat();
	}
	public void compute() {
		area = pi*(length*length);
	}

}

 class Geometry{
	 public void model(Shape ref) {
		ref.input();
		ref.compute();
		ref.output();
	}
 }
 
public class WithOops {
	public static void main(String[] args) {
		Rectangle1 r= new Rectangle1();
		Square1 s =new Square1();
		Circle1 c =new Circle1();
		Geometry g =new Geometry();
		g.model(r);
		g.model(s);
		g.model(c);

		
	}

}
