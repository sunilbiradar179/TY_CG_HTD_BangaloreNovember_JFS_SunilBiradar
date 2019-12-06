package com.tyss.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap2
{
	public static void main(String[] args) {
		LinkedHashMap<Integer, Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(10, new Employee(22,"ajay"));
		l1.put(20, new Employee(26,"amit"));
		l1.put(30, new Employee(21,"surya"));
		l1.put(40, new Employee(25,"sathya"));
		
		Set<Map.Entry<Integer, Employee>> s1=l1.entrySet();
		for (Entry<Integer, Employee> e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			
		}
		System.out.println(l1.isEmpty());
		System.out.println(l1.containsKey(30));
	}
	

}
