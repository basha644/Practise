package com.corestocy.funda;

import java.util.Scanner;

public class ScannerDemo {
	private void form() {
		Scanner sc = new Scanner(System.in);
		int a;
		String name;
		System.out.println("Enter number:");
		System.out.println(a = sc.nextInt());
		System.out.println("Enter name:");
		System.out.println(name = sc.next());

	}

	public static void main(String[] args) {
		ScannerDemo sd = new ScannerDemo();
		sd.form();
	}

}
