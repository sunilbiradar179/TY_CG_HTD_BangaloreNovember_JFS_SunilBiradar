package com.qspiders.accessspecifirs.pkg2;
import com.qsiders.accessspecifiers.pack1.*;

public class TestStudent extends Student 
{
	protected TestStudent(String name)
	{
		super(name);
	}
	public static void main(String[] args) 
	{
		
		TestStudent s2=new TestStudent("sunil");
		s2.studDetails();

	}
	
}
