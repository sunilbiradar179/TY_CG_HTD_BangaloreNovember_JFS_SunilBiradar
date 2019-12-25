package com.tyss.fms.factory;

import com.tyss.fms.bean.dao.ContractorDAO;
import com.tyss.fms.bean.dao.ContractorDAOImpl;


public class ContractorFactory 
{
	public static ContractorDAO instanceOfContractorDAOImpl()
	{
		ContractorDAO dao=new ContractorDAOImpl();
		return dao;
	}

}
