package com.corestocy.exception;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		System.out.println("Connection started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter 1st number:");
		int num1 = sc.nextInt();
		System.out.println("Kindly enter 2nd number:");
		int num2 = sc.nextInt();
		try {
			int divide = num1 / num2;       // If Exception happens, the remaking code inside the try isn't executed.
			System.out.println("value:" + divide);
			System.out.println("Extra try");         
		} 
		
//		catch (Exception e) {               // Catch may not Parent to child
//			// TODO: handle exception
//		}
		catch (ArithmeticException e) {      // Catch may always child to Parent
			System.out.println("Exception:  " + e); // If Exception not happens the code inside the catch block not executed.
			System.out.println("Extra catch");
		}
		System.out.println("Connection stopped normally");

	}

}
