package com.qspiders.typecasting.pkg1;

public class Primitive 
{
	//implicit type casting
	byte b=4;
	short s=b;
	int a=b;
	long l=b;
	float f=b;
	double d=b;
	public void values()
	{
		System.out.println("value of byte="+b);
		System.out.println("value of short="+s);
		System.out.println("value of integer="+a);
		System.out.println("value of long="+l);
		System.out.println("value of float="+f);
		System.out.println("value of double="+d);
	}
 //explicit casting
	double d1=3.142;
	int i=(int) d1;
	float f1=(float)d1;
	
	public void details()
	{
		System.out.println("value of double="+d1);
		System.out.println("value of integer="+i);
		System.out.println("value of float="+f1);
	}
		
}
