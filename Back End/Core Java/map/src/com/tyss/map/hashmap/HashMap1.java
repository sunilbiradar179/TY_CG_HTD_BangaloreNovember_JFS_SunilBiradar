package com.tyss.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1
{
	public static void main(String[] args) {
		HashMap<Integer, String> h1=new HashMap<Integer,String>();
		h1.put(2, "sachin");
		h1.put(4,"suraj" );
		h1.put(8, "ajay");
		h1.put(6, "ajit");//it will not sort values
		h1.put(50, "mahesh");
		Set<Map.Entry<Integer, String>> s1=h1.entrySet();//we have to store entry set into one set
		
		for (Map.Entry<Integer, String> e1 : s1) //iterration of set using for each loop
		{
			System.out.println(e1.getKey());;
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
			
		}
	}

}
