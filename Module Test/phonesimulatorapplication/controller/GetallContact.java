package com.capgemini.phonesimulatorapplication.controller;

import java.util.List;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;
import com.capgemini.phonesimulatorapplication.factory.ContactFactory;
import com.capgemini.phonesimulatorapplication.services.ContactServices;

public class GetallContact {

	public static void main(String[] args) {
		ContactServices services=ContactFactory.instanceOfContactServicesImpl();
		List<ContactInfo> list=services.getAllContact();
		if(list!=null)
		{
			for (ContactInfo co : list) 
			{
				System.out.println(co);
				
			}
			
		}
	}

}
