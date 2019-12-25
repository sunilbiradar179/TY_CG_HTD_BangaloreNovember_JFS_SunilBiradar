package com.tyss.fms.factory;

import com.tyss.fms.bean.dao.ClientDAO;
import com.tyss.fms.bean.dao.ClientDAOImpl;
import com.tyss.fms.bean.dao.CustomerDAO;
import com.tyss.fms.bean.dao.CustomerDAOImpl;

public class ClientFactory {
	
	
	public ClientFactory() {

	}

	
	
	public static ClientDAO instanceOfClientDAOImpl()
	{
		ClientDAO dao=new ClientDAOImpl();
		return dao;
	}
}
