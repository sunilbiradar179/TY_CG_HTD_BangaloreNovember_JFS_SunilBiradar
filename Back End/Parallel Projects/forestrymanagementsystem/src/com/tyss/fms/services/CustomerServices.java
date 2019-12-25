package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.bean.Customer;

public interface CustomerServices 
{
	public List<Customer> getAllCustomers(Customer cust);
	public Customer getCustomer();
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);


}
