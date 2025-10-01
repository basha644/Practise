
public class LaunchMain 
{

	public static void main(String[] args) 
	{
		SelectCourse select=new SelectCourse();
//		
//		Hibernate h=new Hibernate();
//		
//		select.setCourse(h);
		
		//setter injection
//		select.setCourse(new Hibernate());
//		select.setCourse(new JavaCourse());
		select.setCourse(new SpringBoot());
		
		select.select(125.5);

	}

}
