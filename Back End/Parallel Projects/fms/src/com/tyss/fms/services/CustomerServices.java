package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.bean.Customer;

public interface CustomerServices {
	public List<Customer> getAllCustomers();
	public  List<Customer> getCustomer(Customer cust);
	public boolean updateCustomer(Customer cust);
	public boolean deleteCustomer(Customer cust);
	public boolean insertCustomer(Customer cust);


}
