package com.corestocy.funda;

public class VariableDemo {

	/*
	 * Instance variable Class level variables Storage Area: Heap After the main
	 * method while object creation Ist Instance variables will be loaded with default
	 * values in heap area.
	 */
	int num;
	String country;

	public void play() {
		String gameName = "JVM not give any default value for Local variables";
		String game; // Local variable
		// without assigning any value we can't access local variable,
		// The lifetime of local variable is within the scope/method only.
//		System.out.println(game);  //Compile time error
		System.out.println("Local variable: " + gameName);
	}

	public static void main(String[] args) {
//		 for main method one thread is created in the stack area, Inside all the below operations are happen

		/*
		 * object created in heap area without reference. Next, If there is any instance
		 * variable inside the class, those will be stored with default values (If not
		 * assigned any value). To access this object, we need reference from stack.
		 */
		new VariableDemo();
		/*
		 * Object Instantiating class means creation of object
		 * VariableDemo: Class name/Type of data 
		 * vd: objectReference name/ Local reference variable. 
		 * new: Memory allocation in heap area/ to initialize the memory 
		 * VariableDemo():Object holding class name/ constructor for setting the variable default/stored values
		 */
		VariableDemo vd = new VariableDemo();
		/*
		 * Next play method is called and executed in the stack area Local variable is
		 * initialized only when the method is called, and here JVM will not give any default values.
		 * After executing it will go to GC(garbage collector).
		 */
		vd.play();
		System.out.println("Global variable default int value: " + vd.num);
		System.out.println("Global variable default String value: " + vd.country);
		VariableDemo vd1 = new VariableDemo(); // in vd1 object, a separate set of Instance variable values will be stored
		VariableDemo vd2 = new VariableDemo(); // in vd2 object, another set of Instance variable values will be stored
		// In this way for each object, a separate set of Instance variable values will be stored individually.
		// But static variable case only one set will be among all objects not individually separate set

	}

}
