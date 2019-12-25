package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.dao.CustomerDAO;
import com.tyss.fms.factory.CustomerFactory;

public class CustomerServicesImpl implements CustomerServices
{
	
	CustomerDAO dao=CustomerFactory.instanceOfCustomerDAOImpl();
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public List<Customer> getCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(cust);
	}

	@Override
	public boolean deleteCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(cust);
	}

	@Override
	public boolean insertCustomer(Customer cust) {
		
		return dao.insertCustomer(cust);
	}
	

}
