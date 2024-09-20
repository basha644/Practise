package com.basics;


public class Loops {

	// loops: same method/Functionality is need to run multiple times then we will go to
	// For loop: If number of iterations(size) is fixed
	// For each loop: If we need to iterate fixed no.of objects/Arrays
	// While loop: If number of iterations not fixed (iterate a part of the program repeatedly until the specified Boolean condition is true)
	//break: when if condition is satisfies then loop will be break and further not iterated.
	// While using nested loops it breaks the only inner loop not outer loop.
	//continue: when if condition is satisfies then simply it not return/skip that statement/iteration and continues remaining iterations.
	public static void main(String[] args) {
		int i = 10;
		if (i > 15) {
			System.out.println("i greaterthan 15");
			// prints statement if condition is true, skips the else and else if block
		} else if (i > 12) {
			System.out.println("i greaterthan 12");
		} else {
			System.out.println("i lessthan 10");
			// prints statement only if condition is false
		}

		for (int j = 0; j <= 5; j++) {
			System.out.println(j);
		}

		String ar[] = { "a", "b", "c" };
		for (String arr : ar) {
			System.out.println(arr);
		}
		
		// switch
		String course ="java";
		int fee=0;
		switch(course){
			case "java": fee=1000; 	
		break;
		case "python": fee=200;
		break;
	
		}
		System.out.println("fee: "+fee);
		
		//While loop
		int w=0;
		while(w<=5) {
			System.out.println(w);
			w++;
		}
		
		//break
		for(int l=0;l<7;l++) {
			if(l==5) {
				System.out.println("l=5: "+l);
				break; // After if condition is satisfies then loop will be break and further not iterated.
				       // While using nested loops it breaks the only inner loop not outer loop.
			}
			System.out.println(l);
		}
		
		//continue
		for(int l=0;l<7;l++) {
			if(l==5) {
				System.out.println("continue system l=5: "+l);
				continue; // After if condition is satisfies then simply it not return/skip that statement/iteration and continues remaining iterations.
			}
			System.out.println(l);
		}
		

	}
}
