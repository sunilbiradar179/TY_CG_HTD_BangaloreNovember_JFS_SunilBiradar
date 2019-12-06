package com.tyss.queueinterface.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1
{
	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque<>();
		a1.add(23);
		a1.add(10);
		a1.addFirst(100);
		a1.add(50);
		a1.add(45);
		a1.addLast(500);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
