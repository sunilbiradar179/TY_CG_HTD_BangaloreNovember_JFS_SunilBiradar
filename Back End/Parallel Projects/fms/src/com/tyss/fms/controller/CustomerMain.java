package com.tyss.fms.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.factory.CustomerFactory;
import com.tyss.fms.services.CustomerServices;

public class CustomerMain
{
	public static void main(String[] args) {
	
		CustomerServices services=CustomerFactory.instanceOfCustomerServicesImpl();
		Customer cust=new Customer();
		Scanner  sc=new Scanner(System.in);
		
		
		System.out.println("enter custid");
		cust.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("enter name");
		cust.setCustName(sc.nextLine());
		System.out.println("enter address1");
		cust.setAddress1(sc.nextLine());
		System.out.println("enter address2");
		cust.setAddres2(sc.nextLine());
		System.out.println("enter town");
		cust.setTown(sc.nextLine());
		System.out.println("enter postalcode");
		cust.setPostalCode(Integer.parseInt(sc.nextLine()));
		System.out.println("enter email");
		cust.setEmail(sc.nextLine());
		System.out.println("enter phone");
		cust.setPhone(Integer.parseInt(sc.nextLine()));
		
		if(services.insertCustomer(cust))
		{
			System.out.println("user inserted");
		}
		else
		{
			System.err.println("something went wrong");
		}
		
		
		

	
		
		
		
		sc.close();
		
	}

}
