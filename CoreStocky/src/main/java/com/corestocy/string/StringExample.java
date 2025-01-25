package com.corestocy.string;
/*String in Java
A String in Java is an immutable sequence of characters, meaning once created, it cannot be changed.

Key Points:
Stored in the String Pool for memory optimization.
Immutable: Modifications create a new String object.
Useful for fixed, read-only text data.
In heap area duplicates allowed.
IN SCP duplicates are not allowed
Common Methods:
length(): Returns the number of characters.
charAt(index): Fetches the character at a specific index.
substring(start, end): Extracts a part of the string.
equals(): Compares strings for equality.
toUpperCase(), toLowerCase(): Changes case.
replace(oldChar, newChar): Replaces characters.
trim(): Removes leading/trailing spaces.
contains(): Checks if a substring exists*/

public class StringExample {
    public static void main(String[] args) {
        // Creating Strings
        String greeting = "Hello, World!";

        // String Methods
        System.out.println("Length: " + greeting.length()); // Length of the string
        System.out.println("Character at index 7: " + greeting.charAt(7)); // 'W'
        System.out.println("Substring (7 to 12): " + greeting.substring(7, 12)); // 'World'
        System.out.println("Uppercase: " + greeting.toUpperCase()); // 'HELLO, WORLD!'
        System.out.println("Replace 'World' with 'Java': " + greeting.replace("World", "Java")); // 'Hello, Java!'
        System.out.println("Trimmed: " + greeting.trim()); // Removes extra spaces if any
        System.out.println("Contains 'Hello': " + greeting.contains("Hello")); // true
    }
}

/*
Key Differences Between String, StringBuffer, and StringBuilder

Feature      	String	                        StringBuffer	            StringBuilder
Mutability  	Immutable	                    Mutable	                    Mutable
Thread Safety	Thread-safe (by immutability)	Thread-safe (synchronized)	Not thread-safe
Performance	    Slower for frequent changes	    Slower (due to sync)     	Faster (no sync)
Use Case	    Fixed, read-only text        	Multi-threaded apps	        Single-threaded apps

Use Cases
Use String for storing constant, read-only text like configuration keys or user messages.
Use StringBuffer for apps where multiple threads modify the same text (e.g., logging systems).
Use StringBuilder for dynamic text in single-threaded environments (e.g., building SQL queries dynamically).*/



