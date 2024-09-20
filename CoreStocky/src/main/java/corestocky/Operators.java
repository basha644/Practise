package corestocky;

public class Operators {
	public static void main(String[] args) {
		
	boolean a =true;
	boolean b= false;
	boolean c= true;
	boolean d= false;
	
	System.out.println("Logical AND: "+(a&&c)); // If First value is false then it not checks second value simply returns false
	System.out.println("Logical AND: "+(a&&b)); // It cheks if both values are true returns true, otherwise false 
	
	System.out.println("Logical OR: "+(a||b)); // If First value is true then it not checks second value simply returns true
	System.out.println("Logical OR: "+(a||c));// It cheks at least value is true and returns true, otherwise false 
	System.out.println(b||d);

	
	
	

}}
