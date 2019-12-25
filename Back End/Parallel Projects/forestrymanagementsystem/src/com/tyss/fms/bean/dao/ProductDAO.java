package com.tyss.fms.bean.dao;

import java.util.List;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.bean.Product;

public interface ProductDAO 
{
	public List<Product> getAllProducts(Product pd);
	public boolean updateProduct(int  custid,String custname);
	public boolean deleteProduct(Product pd);
	public boolean insertProduct(Product pd);

}
