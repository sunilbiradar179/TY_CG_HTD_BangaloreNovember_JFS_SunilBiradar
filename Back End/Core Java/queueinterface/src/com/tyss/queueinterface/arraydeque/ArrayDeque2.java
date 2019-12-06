package com.tyss.queueinterface.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque2 
{
	public static void main(String[] args)
	{
		ArrayDeque<String> a1=new ArrayDeque<String>();
		a1.add("sunil");
		a1.add("sathya");
		a1.addFirst("suprabhat");
		a1.add("sachin");
		a1.addLast("narayan");
		System.out.println("after using getfirst()");
		System.out.println(a1.getFirst());
		System.out.println("after using getlast()");
		System.out.println(a1.getLast());
		
		System.out.println("after peekfirst()");
		System.out.println(a1.peekFirst());
		
		System.out.println("after iteration using iterator");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
