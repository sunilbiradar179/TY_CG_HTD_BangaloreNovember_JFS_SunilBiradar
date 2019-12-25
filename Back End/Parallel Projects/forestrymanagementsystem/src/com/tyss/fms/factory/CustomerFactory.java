package com.tyss.fms.factory;

import com.tyss.fms.bean.dao.CustomerDAO;
import com.tyss.fms.bean.dao.CustomerDAOImpl;
import com.tyss.fms.services.CustomerServices;
import com.tyss.fms.services.CustomerServicesImpl;

public class CustomerFactory 
{

	public CustomerFactory() {

	}

	public static CustomerDAO instanceOfCustomerDAOImpl()
	{
		CustomerDAO dao=new CustomerDAOImpl();
		return dao;
	}

	//	public static CustomerServices instanceOfCustomerServices()
	//	{
	//		CustomerServices services=(CustomerServices) new CustomerServicesImpl();
	//		return services;
	//	}

}
