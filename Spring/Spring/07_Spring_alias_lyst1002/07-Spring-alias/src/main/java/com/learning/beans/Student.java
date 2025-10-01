package com.learning.beans;

public class Student 
{
	private Books book;
	
	private String name;
	private int age;
	
	public Student()
	{
		System.out.println("Std obj is created...");
	}
	
	public void setBook(Books book) {
		this.book = book;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void task()
	{
		book.readingBook();
	}

	@Override
	public String toString() {
		return "Student [book=" + book + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
