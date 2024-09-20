package corestocky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	
public static void main(String[] args) {
	System.out.println("Hello");
	
	int ar[]= {2,3,4,5};
	
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
