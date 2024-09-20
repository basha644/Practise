package com.corestocy.funda;

class Animal {
    // Common superclass
}

class Dog extends Animal {
    // Dog is a subclass of Animal
}

class Cat extends Animal {
    // Cat is a subclass of Animal
}
public class ArrayDemo {

	

	public static void main(String[] args) {
		 Animal[] animalArray = new Animal[2];
	     animalArray[0] = new Dog(); // Dog is an Animal
	     animalArray[1] = new Cat(); // Cat is an Animal
	     // Here, Animal objects that can hold instances of both Dog and Cat because they are related through the Animal type.
	     // Note: Like that Object data type can hold all type of data types bcz object parent of all data types.
         
		Object ob[]= new Object[5];
		ob[0]=1;
		ob[1]="basha";
		ob[2]='a';
		ob[3]=16.6d;
		System.out.println(ob.length);
		System.out.println(ob[1]);

		
		

	}

}
