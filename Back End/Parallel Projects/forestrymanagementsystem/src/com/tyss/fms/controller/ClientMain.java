package com.tyss.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.fms.bean.Client;
import com.tyss.fms.bean.Customer;
import com.tyss.fms.bean.dao.ClientDAO;
import com.tyss.fms.bean.dao.CustomerDAO;
import com.tyss.fms.factory.ClientFactory;
import com.tyss.fms.factory.CustomerFactory;

public class ClientMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ClientDAO dao=ClientFactory.instanceOfClientDAOImpl();
		
		
		
		while(true)
		{
			
			
			Client client=new Client();
			System.out.println("1.insert  client");
			System.out.println("2.search client");
			System.out.println("3.delete client");
			System.out.println("4.get all client");
			System.out.println("5.Go back to menu");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:System.out.println("Enter client id");
			client.setCid(sc.nextInt());
			
			System.out.println("Enter client name");	
			client.setName(sc.next());
			System.out.println("Enter client address");
			client.setAddress(sc.next());
			System.out.println("Enter client phone");
			client.setPhone(sc.next());
			


			if(dao.insertClient(client))
			{
				System.out.println("successful...");
			}
			else
			{
				System.out.println("failed");
			}
				
			break;
			case 2:List<Client> list2=new ArrayList<Client>();
			list2=dao.searchClient(client);
			System.out.println(list2);
				break;
			case 3:if(dao.deleteClient(client))
			{

				System.out.println("successful...");
			}
			else
			{
				System.out.println("Failed....");
			}
				break;
			case 4:List<Client> list1=new ArrayList<Client>();
			list1=dao.getAllClient(client);

			for (Client client2 : list1) {
				System.out.println(client2);
			}
				break;
			case 5:AdminMain.main(null);
				break;

			default:
				break;
			}
		}
	}

}
