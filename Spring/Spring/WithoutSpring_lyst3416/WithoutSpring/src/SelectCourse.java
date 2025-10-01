
public class SelectCourse 
{
	
	private Courses course;
	
	
	
     public Courses getCourse() {
		return course;
	}


     //setter injection
	public void setCourse(Courses course) //Courses courses= new Hibernate();
	{
		this.course = course;
	}



	public boolean select(Double amount)
     {
    	
    	 course.selectCourse(amount);
    	 
    	 
    	 return true;
     }
}
