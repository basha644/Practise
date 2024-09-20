package com.corestocy.funda;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String simNo="1234567890";
		System.out.println("simNo: "+simNo);
		simNo = simNo.substring(0, 9);
		System.out.println("simNo: "+simNo);// prints first 9 digits
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
		System.out.println("Trim method: "+ss.trim().length());
		
		String u ="";
		String ui=null;
		System.out.println("empty: \n"+u.isEmpty());
//		System.out.println("null:"+ui.isEmpty()); //NullPointerException
		System.out.println("== :"+ui==null);
		
		
		
		
		
		
		
	}

}
