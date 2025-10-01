
public class SpringBoot implements Courses
{

	@Override
	public boolean selectCourse(Double amount)
	{
		System.out.println("SpringBoot Course is selected successfully! with amount : "+ amount);
		return true;
	}

}
