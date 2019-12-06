package com.tyss.queueinterface.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue1 
{
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.offer(21);
		p1.offer(76);
		p1.offer(12);
		p1.offer(10);
		System.out.println("after offer()");
		System.out.println(p1);
		System.out.println("after first poll()");
		p1.poll();
		System.out.println(p1);
		System.out.println("after second poll()");
		p1.poll();
		System.out.println(p1);
		
		System.out.println("after peek()");
		System.out.println(p1.peek());
		
		System.out.println("after element()");
		System.out.println(p1.element());
		
		//p1.remove();
		System.out.println("iterating using for each loop");
		for (Object o1 : p1)
		{
			System.out.println(o1);
			
		}
	}

}
