package com.tyss.fms.factory;


import com.tyss.fms.bean.dao.ProductDAO;
import com.tyss.fms.bean.dao.ProductDAOImpl;

public class ProductFactory
{
	public static ProductDAO instanceOfCustomerDAOImpl()
	{
		ProductDAO dao=new ProductDAOImpl();
		return dao;
	}
	
	
	

}
