package com.corestocy.funda;

public class StringDemo {
	// Immutable String(we can't change) : String
	// Mutable String(we can change) : StringBuffer and StringReader
	// Generally equals method compares rfernces of the object. But in string equals method overrided. So, That why it compares the content
	// In StringBuffer & StringBuilder equals method not overrided. So, That why it compares the refernces
	
	public static void main(String[] args) {
		
		// Strings are stored in SCP(special area in heap) default.
		// Generally string creates in below two ways
		String s="akbar"; // literal (Object created only in SCP, SCP Object is referred/pointed to reference variable)
		String si = new String("akbar"); //new keyword (object created in both Heap & SCP Bcz of new keyword and Here, Heap Object is referred to reference variable)
		
		/*
		 * When we are creating string with new keyword at that time string data stored in heap also,Bcz of new keyword. 
		 * 'new'-means separate/new storage area
		 * SCP- No Duplicates. If any same string coming, at that time instead of new creation it refered the existing object.
		 * Heap- Duplicates will create.(each time new object is created. Even same objet is available)
		 */		
		//Generally string compare in below two ways
		System.out.println(s.equals(si)); //true - Compares content
		System.out.println(s==si); //false - Compares address(storage location)
		
		String s1=s;
		String s2="Akbar";
		System.out.println(s.equals(s1)); //true Bcz,content is same
		System.out.println(s.equals(s2)); //false Bcz,content is same but problem with first letter(Akbar)
		System.out.println(s.equalsIgnoreCase(s2)); //Now it is true, Bcz here it considers equalsIgnoreCase means caseSensitive is not a problem.
		System.out.println(s==s1); //true ,Already "akbar" string available in SCP so it refers the existing sting)  (There is no chance to create duplicate strings)
		System.out.println(s==s2); //false ,Here content is different that why it creates new object obviously address will be changed.
		
		/*
		 * String objects are cached/stored in the String pool, and it makes the String immutable.
		 * objects that cannot be modified once it is created. But we can only change the reference to the object.
		 * NOTE: String is immutable in Java because of the security(used as passwords),caching(consumes multiple classes if changed it will be effected), and class loading(loaded in SCP).
		 */		
	}

}
