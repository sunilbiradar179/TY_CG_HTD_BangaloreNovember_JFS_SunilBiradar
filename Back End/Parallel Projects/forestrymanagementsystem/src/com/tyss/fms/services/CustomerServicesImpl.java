package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.bean.dao.CustomerDAO;
import com.tyss.fms.factory.CustomerFactory;

public class CustomerServicesImpl 
{
	CustomerDAO dao=CustomerFactory.instanceOfCustomerDAOImpl();
	public List<Customer> getAllCustomers() 
	{


		return null;
	}

	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

}
