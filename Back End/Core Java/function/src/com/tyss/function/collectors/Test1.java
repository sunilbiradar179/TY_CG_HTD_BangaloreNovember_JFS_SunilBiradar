package com.tyss.function.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test1
{
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(23);
		a1.add(33);
		a1.add(24);
		a1.add(45);
		a1.add(96);
		
		System.out.println("--------using filter-------");
		List l1=a1.stream().filter(i->i%2==0).collect(Collectors.toList());//for filtering the even numbers from list
		System.out.println(l1);
		
		System.out.println("---------using map-----------");
		List l2=a1.stream().map(i->i*100).collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println("--getting max value---------");
		
		Optional<Integer> i1=a1.stream().max((i,j)->i.compareTo(j));
		System.out.println(i1);
	}

}
