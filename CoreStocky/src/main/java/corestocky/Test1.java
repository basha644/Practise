package corestocky;

import java.util.*;

public class Test1 {
	
public static void main(String[] args) {
	System.out.println("Hello");

	Date d = null;
	int ar[]= {2,3,4,5};
	int n = ar[3];
	System.out.println("n = " + n);
	int n1 = ar[4];
	System.out.println("n1 = " + n1);
//	int n1 = ar[4];

	for(int i=0; i<ar.length;i++)
		System.out.println(i);
	
	System.out.println();
	for(int j:ar)
		System.out.println(j);
	
	List<Object>l= new ArrayList();
	l.add("a");
	l.add("b");
	l.add(1);
	l.add(1.24);
	l.add(true);
	l.add(1.234f);
	System.out.println(l);
	
	Map<String,Object> m = new HashMap();
	m.put("name", "basha");
	m.put("salary", 1985.9);
	System.out.println(m);
	
	System.out.println(Arrays.toString(ar));
	
	
	


}
}
