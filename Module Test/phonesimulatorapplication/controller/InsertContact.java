package com.capgemini.phonesimulatorapplication.controller;

import java.util.Scanner;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;
import com.capgemini.phonesimulatorapplication.factory.ContactFactory;
import com.capgemini.phonesimulatorapplication.services.ContactServices;

public class InsertContact {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ContactInfo con=new ContactInfo();
		
		ContactServices services=ContactFactory.instanceOfContactServicesImpl();
		
		System.out.println("Enter name");
		con.setName(sc.nextLine());
		System.out.println("Enter number");
		con.setNumber(Long.parseLong(sc.nextLine()));
		System.out.println("Enter group");
		con.setGroups(sc.nextLine());
		
		if(services.addContact(con))
		{
			System.out.println("contact added......");
		}
		else
		{
			System.err.println("Something went wrong...");
		}
		
		sc.close();
		
		
	}

}
