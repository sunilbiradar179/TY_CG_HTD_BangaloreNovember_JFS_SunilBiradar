package com.tyss.map.treemap;

public class Student implements Comparable<Student>
{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*@Override//this is for sorting name
	public int compareTo(Student o) {
		return (this.name .compareTo(o.name));
	}*/

	/*@Override//this is for sorting age
	public int compareTo(Student o) {
		if(this.age>o.age)
			return 1;
		else if(this.age<o.age)
			return -1;
		else
			return 0;
	}*/
	

	
	
	
	

}
