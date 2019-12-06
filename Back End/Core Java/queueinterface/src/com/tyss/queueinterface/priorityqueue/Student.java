package com.tyss.queueinterface.priorityqueue;

public class Student implements Comparable
{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	

}
