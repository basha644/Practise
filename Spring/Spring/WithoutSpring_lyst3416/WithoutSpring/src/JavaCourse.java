
public class JavaCourse implements Courses
{

	@Override
	public boolean selectCourse(Double amount) 
	{
		System.out.println("Java Course is selected successfully! with amount : "+ amount);
		return true;
	}

}
