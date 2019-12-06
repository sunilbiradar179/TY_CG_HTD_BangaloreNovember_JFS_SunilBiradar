package com.tyss.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2
{
	public static void main(String[] args) {
		HashMap<Integer, Student> h1=new HashMap<Integer,Student>();
		h1.put(10, new Student(22,"amit"));
		h1.put(20, new Student(24,"sachin"));
		//h1.put(10, new Student(23,"sathya"));//we can not have duplicate key
		h1.put(null, new Student(24,"sachin"));//we can have only one null value and we can have multiple duplicate "VALUES" but not duplicate  "KEY" values
												//if we have duplicate "KEY" it will override last entry
		
		Collection<Student> c1=h1.values();
		
		for (Student s1 : c1) 
		{
			System.out.println(s1);
			
		}
		
		Set<Integer> s1=h1.keySet();
		
		for (Integer i1 : s1) 
		{
			System.out.println(i1);
			
		}
		
		System.out.println(h1.containsKey(10));
		System.out.println(h1.containsValue(new Student(22,"amit")));
		System.out.println(h1.isEmpty());
	}

}
