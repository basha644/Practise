package com.telusko.beans;

public class CourseSelecting 
{
	private Course course ; /// new Java();
	
	public Course getCourse() 
	{
		return course;
	}
//	static
//	{
//		System.out.println("CourseSelecting class loaded");
//	}
	
	public CourseSelecting(Course course)
	{
		System.out.println("Constructor injection");
		this.course=course;
	}
	
	public CourseSelecting()
	{
		System.out.println("Course Selecting target obj is created");
	}

   //setter
	public void setCourse(Course course) 
	{
		System.out.println("Setter injection");
		this.course = course;
	}

	public boolean chooseCourse(Double amount)
	{
		
//		course.selectCourse(amount);
//		return true;
		return course.selectCourse(amount);
		
	}
}
