package com.tyss.map.treemap;

import java.security.KeyStore.SecretKeyEntry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 
{
	public static void main(String[] args) 
	{
		SortingAge a1=new SortingAge();
		SortingName n1=new SortingName();
		TreeMap<Student, String> t1=new TreeMap<Student,String>(n1);
		t1.put(new Student(12,"sunil"), "1st std");
		t1.put(new Student(11,"raju"), "2nd std");
		t1.put(new Student(34,"bharat"), "3rd std");
		t1.put(new Student(45,"abhay"), "4th std");
		
		Set<Map.Entry<Student, String>> s1=t1.entrySet();
		
		for (Map.Entry<Student, String> e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			
		}
	}

}
