package com.tyss.fms.factory;

import com.tyss.fms.dao.CustomerDAO;
import com.tyss.fms.dao.CustomerDAOImpl;
import com.tyss.fms.services.CustomerServices;
import com.tyss.fms.services.CustomerServicesImpl;

public class CustomerFactory 
{
	public CustomerFactory()
	{
		
	}
	public static CustomerDAO instanceOfCustomerDAOImpl() 
	{
		CustomerDAO dao=new CustomerDAOImpl();
		return dao;
		
	}
	public static CustomerServices instanceOfCustomerServicesImpl()
	{
		CustomerServices services=new CustomerServicesImpl();
		return services;
	}
	

}
