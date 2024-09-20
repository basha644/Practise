package com.corestocy.innerclass;

class Animal {
	void bark() {
		System.out.println("slowly");
	}
}

//class Dog extends Animal{
//	void bark() {
//		System.out.println("fastly");
//	}
//}

interface Dog {
	void bark();

	static void play() {
		System.out.println("cricket");
	}

	public static void main(String[] args) {
		Dog.play();
	}
}

public class AnonymousInnerclassDemo {
	public static void main(String[] args) {
//		Animal a = new Dog();
//		a.bark(); // Old methodology

		// AnonymousInnerclass
		// A class without name
		Animal a = new Animal() { // In systemexplorer it saves as (AnonymousInnerclassDemo$1.class) and consumes
									// memory also
			void bark() {
				System.out.println("fastly");
			}

			void barking() {
				System.out.println("fastly");
			}

		};
		a.bark();
// By using Innerclass We can access only one method(Overriden method). if even we are written more methods(It treats like special method) not showing any error.		
//		a.barking(); 

		// Interface Object creation with help of Anonymous Inner class
		// Here, we are Instantiating the Anonymous Inner class not Interface;
		Dog d = new Dog() {

			@Override
			public void bark() {
				System.out.println("AnonymousInner");
			}
		};
		d.bark();

	}

}
