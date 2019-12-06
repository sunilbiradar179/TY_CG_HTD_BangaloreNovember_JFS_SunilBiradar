package com.tyss.queueinterface.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 
{
	public static void main(String[] args) {
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		p1.offer(new Student(12,"sunil"));
		p1.offer(new Student(10,"sathya"));
		p1.offer(new Student(33,"amit"));
		
		for (Student s1 : p1)
		{
			System.out.println(s1);
			
		}
	}

}
