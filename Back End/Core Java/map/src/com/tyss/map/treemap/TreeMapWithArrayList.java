package com.tyss.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapWithArrayList
{
	public static void main(String[] args) {
		ArrayList<Student1> a1=new ArrayList<Student1>();
		a1.add(new Student1(11,"sunil"));
		a1.add(new Student1(34,"dhiraj"));
		a1.add(new Student1(45,"suraj"));
		a1.add(new Student1(23,"abhay"));
		
		
		ArrayList<Student1> a2=new ArrayList<Student1>();
		a2.add(new Student1(11,"suprabhat"));
		a2.add(new Student1(34,"raju"));
		a2.add(new Student1(45,"surya"));
		a2.add(new Student1(23,"sumukha"));
		
		ArrayList<Student1> a3=new ArrayList<Student1>();
		a3.add(new Student1(11,"pooja"));
		a3.add(new Student1(34,"zeenath"));
		a3.add(new Student1(45,"saba"));
		a3.add(new Student1(23,"sangita"));
		
		ArrayList<Student1> a4=new ArrayList<Student1>();
		a4.add(new Student1(11,"krishna"));
		a4.add(new Student1(34,"balu"));
		a4.add(new Student1(45,"rushi"));
		a4.add(new Student1(23,"sushil"));
		
		
		
		
		TreeMap<String, ArrayList<Student1>> t1=new TreeMap<String,ArrayList<Student1>>();
		t1.put("1st std", a1);
		t1.put("2nd std", a2);
		t1.put("3rd std", a3);
		t1.put("4th std", a4);
		
	Set<Map.Entry<String, ArrayList<Student1>>> s1=t1.entrySet();
	
	for (Entry<String, ArrayList<Student1>> e1 : s1)
	{
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("-------------------------------");
		
	}
		
		
	}

}
