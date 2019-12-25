package com.tyss.fms.controller;

import java.util.Scanner;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.factory.CustomerFactory;
import com.tyss.fms.services.CustomerServices;

public class UpdateCustomer 
{
	public static void main(String[] args) {
		CustomerServices services=CustomerFactory.instanceOfCustomerServicesImpl();
		Scanner sc=new Scanner(System.in);
		Customer cust=new Customer();
		
		System.out.println("enter customerid");
		cust.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("enter new email to update");
		cust.setEmail(sc.nextLine());
		
		if(services.updateCustomer(cust))
		{
			System.out.println("email updated");
		}
		else
		{
			System.err.println("something went wrong");
		}
		sc.close();
	}

}
