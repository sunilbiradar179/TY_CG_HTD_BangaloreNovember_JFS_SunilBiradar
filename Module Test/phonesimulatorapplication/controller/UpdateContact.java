package com.capgemini.phonesimulatorapplication.controller;

import java.util.Scanner;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;
import com.capgemini.phonesimulatorapplication.factory.ContactFactory;
import com.capgemini.phonesimulatorapplication.services.ContactServices;

public class UpdateContact
{
	public static void main(String[] args) {
		ContactServices services=ContactFactory.instanceOfContactServicesImpl();
		Scanner sc=new Scanner(System.in);
		ContactInfo con=new ContactInfo();
		
		System.out.println("enter name");
		con.setName(sc.nextLine());
		System.out.println("enter new group to update");
		con.setGroups(sc.nextLine());
		
		if(services.updateContact(con))
		{
			System.out.println("groups updated");
		}
		else
		{
			System.err.println("something went wrong");
		}
		sc.close();
	}

}
