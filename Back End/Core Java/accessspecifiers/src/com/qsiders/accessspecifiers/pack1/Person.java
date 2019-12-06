package com.qsiders.accessspecifiers.pack1;

public class Person
{
	static public int age=20;
	String name;
	public Person(String name)
	{
		this.name=name;
	}
	public void personDetails()
	{
		System.out.println("name="+name);
	}
	public static void details()
	{
		System.out.println("age="+age);
	}

}
