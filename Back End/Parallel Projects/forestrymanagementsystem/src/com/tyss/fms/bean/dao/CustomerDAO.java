package com.tyss.fms.bean.dao;

import java.util.List;

import com.tyss.fms.bean.Customer;

public interface CustomerDAO
{
	public List<Customer> getAllCustomers(Customer cust);
	public  List<Customer> getCustomer(Customer cust);
	public boolean updateCustomer(int  custid,String custname);
	public boolean updateAddress(int  custid1,String custaddress);
	public boolean updateEmail(int  custid2,String custemail);
	public boolean deleteCustomer(Customer cust);
	public boolean insertCustomer(Customer cust);


}
