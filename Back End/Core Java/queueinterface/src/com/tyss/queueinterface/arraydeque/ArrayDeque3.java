package com.tyss.queueinterface.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque3
{
	public static void main(String[] args)
	{
		ArrayDeque<Student> a1=new ArrayDeque<Student>();
		a1.add(new Student(11,"sachin"));
		a1.add(new Student(45,"rohit"));
		a1.add(new Student(31,"dhoni"));
		
		Iterator<Student> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
