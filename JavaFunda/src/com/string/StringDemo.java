package com.string;

public class StringDemo {
	public static void main(String[] args) {
		
		String s = new String("akbar");
		String s1 = "akbar";
		String s2;
		String s3 = "akbarbasha";
		String s4 = "akbarbasha";
		String s5 ;
		String s6 ="";
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
		System.out.println("equal   :"+ s.equals(s1));
		System.out.println("s==  :"+s==s1);
		
		s.concat("basha");
		System.out.println("s1:"+s1);
//		System.out.println("equal   :"+ s2.equals(s1));
//		System.out.println("double:"+ s2==s1);
		s2=	s1.concat("basha");
		s1=	s1 +"basha";
		System.out.println(s1==s2);
		System.out.println(s4==s3);
		System.out.println();

//		s2=	s1 +" basha";

		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		String a="akbar";
		String b="basha";
		String c="ali";
		String d =a.trim()+b+c.trim();
		System.out.println(d);
//		System.out.println("s5:"+s5);
		System.out.println("s6:"+s6);


	}

}

