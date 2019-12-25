package com.tyss.fms.bean.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.bean.Product;

public class ProductDAOImpl implements ProductDAO 
{
	List<Product> list=new ArrayList<Product>();
	@Override
	public List<Product> getAllProducts(Product pd) {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public boolean updateProduct(int custid, String custname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(Product pd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertProduct(Product pd) {
		// TODO Auto-generated method stub
		
		list.add(pd);
		return true;
	}

	

}
