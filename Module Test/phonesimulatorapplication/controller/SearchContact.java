package com.capgemini.phonesimulatorapplication.controller;

import java.util.Scanner;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;
import com.capgemini.phonesimulatorapplication.factory.ContactFactory;
import com.capgemini.phonesimulatorapplication.services.ContactServices;

public class SearchContact {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ContactServices services=ContactFactory.instanceOfContactServicesImpl();
		
		System.out.println("Enter the name to search");
		ContactInfo c1=services.getContact(sc.next());
		if(c1==null)
		{
			System.out.println("something went wrong");
		}
		else
		{
			System.out.println(c1);
			
			System.out.println("1.call");
			System.out.println("2.Message");
			System.out.println("3.go back to menu");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("call started");
				System.out.println("connected");
				System.out.println("enter any number to disconnect");
				int num=sc.nextInt();
				System.out.println("call ended");
				SearchContact.main(null);
				break;
			case 2:System.out.println("enter message");
					String msg=sc.nextLine();
					System.out.println("message sent");
					SearchContact.main(null);
				break;
			case 3:SearchContact.main(null);
				break;

			default:System.out.println("enter correct choice");
				break;
			}
		}

	}

}
