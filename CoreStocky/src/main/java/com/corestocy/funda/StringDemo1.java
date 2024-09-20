package com.corestocy.funda;

public class StringDemo1 {
	//Concatination
	//References and inbuilt methods are happened in runtime only
	//After object creation then only references and inbuilt methods will call and aplly
	//In string tostring method is overrided defaultly
	public static void main(String[] args) {
		
		String s="airtel";
		System.out.println(s); //airtel
		s.concat("revenue"); // new revenue object is created in SCP but not refered and airtelrevenue also created in heap area. It also not referred.
		System.out.println(s); // Here, 's' referred to airtel object.
		
		// In java string manipulation and inbuilt string methods will run in runtime only and concatenated object is store in always heap area.
		String s1=s.concat("revenue"); // now, airtelrevenue objet is created in heap area and now referes to s1.
		System.out.println(s1); //airtelrevenue
		
		String s2= "akbar";
		System.out.println(s2); // akbar object stored in SCP and refers to s2
		s2=s2.concat("basha"); // Note: concat object is stored in heap area and s2 refers to this object
		System.out.println(s2); // Note: Here, s2 refered to heap object(akbarbasha) not SCP object(basha).
		// some persons are tell this one is mutable but real thing is s2 refernce is changed.
		
		String v ="vasimbasha";
		String va="vasim"+"basha";
		System.out.println(v==va);// true, Here objects are stored in SCP 
		
		String v1 ="vasim123";
		String va1="vasim"+1+2+3;
		System.out.println(v1==va1);// true, Here objects are stored in SCP 
		
		String v2 ="vasim";
		String v2i ="vasim bhai";
		String va2=v2+" bhai";
		String v3i ="vasim bhai";
		System.out.println(v2i==va2);// false, Bcz Here v2i-SCP,va2-Heap
		System.out.println(v2i==v3i);
		
		String simNo=    "1234567890";
		String simNo1="1234567890";
		System.out.println(simNo==simNo1);
		
		
		// FINAL Keyword
		final String name ="name";
//		name= name+"akbar"; Here, Final is restricted to reference name not string object.
		String name1= name+"akbar";
		
		
		
		
		

		
		
		
	}
}
