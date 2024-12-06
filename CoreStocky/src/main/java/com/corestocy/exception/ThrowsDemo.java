package com.corestocy.exception;
import java.util.Scanner;

/*Note:
Hence the main goal of "throws" keyword is to delicate the responsibility of exception handling to the caller method.
"Throws" keyword required only checked exceptions. Usage of throws for unchecked exception there is no use.
		"Throws" keyword required only to convene compiler. Usage of throws keyword doesn't prevent abnormal termination of the program.
Hence recommended to use try-catch over throws keyword.
Exception handling keywords summary:
		try: To maintain risky code.
		catch: To maintain handling code.
		finally: To maintain cleanup code.
		throw: To handover our created exception object to the JVM manually.
		throws: To delegate responsibility of exception handling to the caller method.
Note: It is highly recommended to maintain our customized exceptions as unchecked by extending RuntimeException.
We can catch any Throwable type including Errors also*/
class Demo
{
	void alpha()throws Exception  // Ducking Exception mostly used in checked Exception

	{
		System.out.println("Connection2 is Established to An App");
		Scanner scan =new Scanner(System.in);

		System.out.println("Kindly enter the numerator to divide ");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the denominator");
		int num2=scan.nextInt();
		
		int res=num1/num2;

		System.out.println("The result is : "+ res);
		
		
		System.out.println("Connection2 is terminated from An App");
		
	}
}
public class ThrowsDemo {

	public static void main(String[] args) 
	{
		System.out.println("Connection1 is Established to An App");
		try
		{
		Demo d=new Demo();
		d.alpha();
		}
		catch(Exception e)
		{
			System.out.println("Exception is handling in main method");
		}
		
		System.out.println("Connection1 is terminated from An App");



	}

}
