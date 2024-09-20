package com.corestocy.innerclass;

class A{
	void camp() {
		System.out.println("Outer class");
	}

 class B{
	void play() {
		System.out.println("Member Inner class");
	}
}
 //Generally static keyword is not allow in class level. Itis applicable for only innerclass.
static class C{
	void see() {
		System.out.println("Static Inner class");
	}
}
}




public class InnerClassDemo {
	public static void main(String[] args) {
		A a =new A();
		a.camp();
		A.B ab =a.new B();
		ab.play();
		
		A.C ac =new A.C();
		ac.see();
		
	}
	

}
