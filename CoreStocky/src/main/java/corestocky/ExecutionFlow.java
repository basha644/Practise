package corestocky;

class Demo3 {
	
	public static void sport() {
		System.out.println("parent ");
	}

	/* If we need execute any statement at thae time of onbject creation. Then
	 * we must include that within Constructor bcz Constructor is invoked when we create an Object. */
	Demo3(){
		System.out.println("parent class constructor ");
	}
	
}
class Demo2 extends Demo3{
	static int a, b;

	int x, y;

	static {
		a = 10;
		b = 20;
		System.out.println("without object creation first Static block will be printed");
	}

	{
		x = 10;
		y = 20;
		System.out.println("Non Static block/Java Block");
	}

	public Demo2() {
//		{
//			x=10;
//			y=20;
//			System.out.println("Non Static block/Java Block");
//		}
		System.out.println("Demo2 Constructor");
	}

	public static void disp() {
		System.out.println("After static block Static method will execute.");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	}

	public void disp2() {
		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);
	}
}

public class ExecutionFlow {

	public static void main(String[] args) {
		Demo2.disp();

		// Demo2.disp2();

		Demo2 d = new Demo2();
		d.disp2();
		System.out.println();
		Demo2 d1 = new Demo2();

		// d.disp();

	}

}