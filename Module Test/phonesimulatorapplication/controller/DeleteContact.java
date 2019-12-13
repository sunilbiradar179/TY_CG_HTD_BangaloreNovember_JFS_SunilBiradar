package com.capgemini.phonesimulatorapplication.controller;

import java.util.Scanner;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;
import com.capgemini.phonesimulatorapplication.factory.ContactFactory;
import com.capgemini.phonesimulatorapplication.services.ContactServices;

public class DeleteContact {
	public static void main(String[] args)
	{
		ContactServices services=ContactFactory.instanceOfContactServicesImpl();
		Scanner sc=new Scanner(System.in);
		ContactInfo con=new ContactInfo();
		
		System.out.println("Enter contact name");
		con.setName(sc.nextLine());
		
		if(services.deleteContact(con))
		{
			System.out.println("deleted");
		}
		else
		{
			System.err.println("something went wrong");
		}
		sc.close();
		

	}


}
