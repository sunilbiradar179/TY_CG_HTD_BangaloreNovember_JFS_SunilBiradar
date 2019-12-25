package com.tyss.fms.bean.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.fms.bean.Customer;

public class CustomerDAOImpl implements CustomerDAO  
{

	Scanner sc=new Scanner(System.in);
	List<Customer> list=new ArrayList<Customer>();

	@Override
	public List<Customer> getAllCustomers(Customer cust) 
	{
		return list;

	}



	

	@Override
	public boolean updateCustomer(int custid,String custname) 
	{
		for (Customer customer : list) 
		{
			if(customer.getCustId()==custid)
			{
				Customer cust=customer;
				cust.setCustName(custname);
				return true;
				
			}
			
		}
		return false;
		


	}

	@Override
	public boolean deleteCustomer(Customer cust) 
	{
		System.out.println("enter the index");
		int index=sc.nextInt();
		list.remove(index);
		return true;
		

	}



	@Override
	public boolean insertCustomer(Customer cust) 
	{

		list.add(cust);
		return true;






	}



	@Override
	public boolean updateAddress(int custid, String custaddress) {
		
		for (Customer customer : list) 
		{
			if(customer.getCustId()==custid)
			{
				Customer cust=customer;
				cust.setAddress1(custaddress);
				return true;
				
			}
			
		}
		return false;
	}



	@Override
	public boolean updateEmail(int custid, String custemail) {
		for (Customer customer : list) 
		{
			if(customer.getCustId()==custid)
			{
				Customer cust=customer;
				cust.setEmail(custemail);
				return true;
				
			}
			
		}
		return false;
	}





	@Override
	public List<Customer> getCustomer(Customer cust) {
		System.out.println("enter the index");
		int index=sc.nextInt();
		list.get(index);
		return list;
	}

}
