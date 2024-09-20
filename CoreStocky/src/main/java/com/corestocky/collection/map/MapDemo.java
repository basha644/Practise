package com.corestocky.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

//	A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.
//	A Map is useful if you have to search, update or delete elements on the basis of a key.
//	A Map doesn't allow duplicate keys, but you can have duplicate values. 
//	HashMap and LinkedHashMap allow null keys and values, but 
//	TreeMap doesn't allow any null key or value.
//	A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.

//	HashMap:	HashMap is the implementation of Map, but it doesn't maintain any order.
//	LinkedHashMap:	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
//	TreeMap:	TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
	
	public static void main(String[] args) {
		Map<Object, String> m = new HashMap();
		m.put(1, "akbar");
		m.put(null, null);
		m.put(5, "basha");
		m.put(null, "naseem");
		m.put(3, "farook");
		System.out.println(m);
		
		for (Map.Entry<Object, String> entry : m.entrySet()) {
			Object key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" "+val);
			
		}
		
		
	}

	
}
