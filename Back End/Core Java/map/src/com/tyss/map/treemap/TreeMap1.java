package com.tyss.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1
{
	public static void main(String[] args) {
		TreeMap<Integer, String> t1=new TreeMap<Integer,String>();
		t1.put(45, "sathya");
		t1.put(78, "sachin");
		t1.put(12, "sunil");
		t1.put(91, "ajit");
		//t1.put(null, "suraj");//null is not allowed in treemap
		t1.put(45, "sathya");
		
		Set<Map.Entry<Integer, String>> s1=t1.entrySet();
		
		for (Map.Entry<Integer, String> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("---------------");
			
		}
	}

}
