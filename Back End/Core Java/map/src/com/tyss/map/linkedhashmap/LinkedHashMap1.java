package com.tyss.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMap1 
{
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
		l1.put("hebbal", 500024);
		l1.put("btr", 560026);
		l1.put("btm", 560012);
		l1.put("rajajinagar", 560034);
		l1.put(null, 123456);//only one key should be null
		l1.put("hebbal", 500024);//key can not be duplicate
		
		l1.remove("btr");
		
		Set<Map.Entry<String, Integer>> s1=l1.entrySet();
		
		for (Map.Entry<String, Integer> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------");
			
		}
		
		System.out.println(l1.isEmpty());
		System.out.println(l1.containsKey("btr"));
		System.out.println(l1.containsValue(560012));
		System.out.println(l1.size());
		System.out.println(l1.keySet());
		System.out.println(l1.values());
	}

}
