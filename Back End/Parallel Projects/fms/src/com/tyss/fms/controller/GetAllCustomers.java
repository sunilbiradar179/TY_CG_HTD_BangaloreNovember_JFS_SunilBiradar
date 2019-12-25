package com.tyss.fms.controller;

import java.util.List;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.factory.CustomerFactory;
import com.tyss.fms.services.CustomerServices;

public class GetAllCustomers 
{
	public static void main(String[] args) {
		CustomerServices services=CustomerFactory.instanceOfCustomerServicesImpl();
		List<Customer> list=services.getAllCustomers();
		
		
		if(list!=null)
		{
			for (Customer c1 : list)
			{
				System.out.println(c1);
				
			}
		}
	}

}
