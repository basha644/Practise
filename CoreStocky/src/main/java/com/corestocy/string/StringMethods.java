package com.corestocy.string;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String simNo="1234567890";
		System.out.println("simNo: "+simNo);
		simNo = simNo.substring(0, 9);
		System.out.println("simNo: "+simNo);// prints first 9 digits including 0 also
		simNo = simNo.substring(2, 9);
		System.out.println("simNo: "+simNo);// prints from 3-9
		
		String name = "akbarbasha";
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(2));
		
		char ch[]= name.toCharArray();
		for (char c : ch) {
			
			System.out.print(c+" ");
		}
		System.out.println("");
		System.out.println(ch.length);
		
		String ss="   ";
		System.out.println("white spaces count:"+ss.length());
		System.out.println("Trim method: "+ss.trim().length()); // Trim eliminates spaces in string and gives length of the string without spaces
		
		String u ="";
		String ui=null;
		System.out.println("empty: \n"+u.isEmpty());
//		System.out.println("null:"+ui.isEmpty()); //NullPointerException
		System.out.println("== :"+ui==null);

		String str = "Hello World";

// Length
		int length = str.length();  // 11

// Character access
		char firstChar = str.charAt(0);  // 'H'

// Substring
		String sub1 = str.substring(6);    // "World"
		String sub2 = str.substring(0, 5); // "Hello"

// Concatenation
		String newStr = str + "!";  // "Hello World!"
		String concat = str.concat("!");  // "Hello World!"

// Equality
		boolean isEqual = str.equals("Hello World");  // true
		boolean ignoreCase = str.equalsIgnoreCase("hello world");  // true

// Search
		int index = str.indexOf("World");  // 6
		boolean contains = str.contains("Hello");  // true

// Replace
		String replaced = str.replace("World", "Java");  // "Hello Java"

// Case conversion
		String upper = str.toUpperCase();  // "HELLO WORLD"
		String lower = str.toLowerCase();  // "hello world"

// Trimming whitespace
		String withSpaces = "   Hello   ";
		String trimmed = withSpaces.trim();  // "Hello"

// Split
		String csv = "apple,banana,orange";
		String[] fruits = csv.split(",");  // ["apple", "banana", "orange"]

	}

}
