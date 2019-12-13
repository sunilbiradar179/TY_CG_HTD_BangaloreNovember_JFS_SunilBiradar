package com.capgemini.phonesimulatorapplication.factory;

import com.capgemini.phonesimulatorapplication.dao.ContactDAO;
import com.capgemini.phonesimulatorapplication.dao.ContactDAOImpl;
import com.capgemini.phonesimulatorapplication.services.ContactServices;
import com.capgemini.phonesimulatorapplication.services.ContactServicesImpl;

public class ContactFactory
{
	public static ContactDAO instanceOfContactDAOImpl()
	{
		ContactDAO dao=new ContactDAOImpl();
		return dao;
	}
	
	public static ContactServices instanceOfContactServicesImpl()
	{
		ContactServices services=new ContactServicesImpl();
		return services;
	}

}
