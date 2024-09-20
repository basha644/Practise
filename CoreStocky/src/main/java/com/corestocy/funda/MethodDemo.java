package com.corestocy.funda;

class Action{
	
	int  a;
	int b;
	/*
	 * Method: perform some task
	 * public: Access modifier If not provided then it will be Default modifier
	 * Return type
	 * Void: Any type of date we can return like int,double,long,char,string.
	 * If need to restrict return type then we need to declare 
	 * playCricket(): methodName naming convention camelcase
	 */
	public void playCricket(int a) {
		
	}
	// with return type
    public String playCricket() {
    	String name="basha";
    	return name;
	}
    
    public String playCricket(String name) {
    	 name="basha";
    	return name;
	}
    public int playCricket(int num1, int num2) {
   	 a=num1;
   	 b=num2;
   	 int total =a+b;	 
   	return total;
	}
    
}
public class MethodDemo {
	public static void main(String[] args) {
		
		Action ac =new Action();
		System.out.println(ac.playCricket());
		ac.playCricket("basha");
		ac.playCricket(5, 5);
		System.out.println(ac);
	}
	

}
