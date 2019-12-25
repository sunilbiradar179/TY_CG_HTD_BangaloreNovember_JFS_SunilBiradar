package com.tyss.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.Marshaller.Listener;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.bean.dao.CustomerDAO;
import com.tyss.fms.bean.dao.CustomerDAOImpl;
import com.tyss.fms.factory.CustomerFactory;

public class GetAllCustomers 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		CustomerDAO dao=CustomerFactory.instanceOfCustomerDAOImpl();

		while(true)
		{
			Customer cust=new Customer();
			System.out.println("1.insert  customer");
			System.out.println("2.search customer");
			System.out.println("3.update customer");
			System.out.println("4.delete customer");
			System.out.println("5.get all customers");
			System.out.println("6.Go back to menu");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter customer id");
			cust.setCustId(sc.nextInt());
			System.out.println("Enter customer name");	
			cust.setCustName(sc.next());
			System.out.println("Enter customer address1");
			cust.setAddress1(sc.next());
			System.out.println("Enter customer address2");
			cust.setAddres2(sc.next());
			System.out.println("Enter customer town");
			cust.setTown(sc.next());
			System.out.println("Enter customer postalcode");
			cust.setPostalCode(sc.nextInt());
			System.out.println("Enter customer email");
			cust.setEmail(sc.next());
			System.out.println("Enter customer phone");
			cust.setPhone(sc.nextInt());


			if(dao.insertCustomer(cust))
			{
				System.out.println("successful...");
			}
			else
			{
				System.out.println("failed");
			}

			break;
			case 2:
				List<Customer> list2=new ArrayList<Customer>();
				list2=dao.getCustomer(cust);
				System.out.println(list2);
				break;
			case 3:
				System.out.println("1.update name");
				System.out.println("2.update address1");
				System.out.println("3.update email");
				System.out.println("enter your choice");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:System.out.println("enter custid to update name");
				int custid=sc.nextInt();
				System.out.println("enter new name");
				String custname=sc.next();
				if(dao.updateCustomer(custid,custname))
				{
					System.out.println("successfully updated ");
				}
				else
				{
					System.out.println("failed");
				}

				break;

				case 2:System.out.println("enter custid to update address");
				int custid1=sc.nextInt();
				System.out.println("enter new address");
				String custaddress=sc.next();
				if(dao.updateAddress(custid1,custaddress))
				{
					System.out.println("successfully updated ");
				}
				else
				{
					System.out.println("failed");
				}

				break;
				case 3:System.out.println("enter custid to update email");
				int custid2=sc.nextInt();
				System.out.println("enter new email");
				String custemail=sc.next();
				if(dao.updateEmail(custid2,custemail))
				{
					System.out.println("successfully updated ");
				}
				else
				{
					System.out.println("failed");
				}
				break;

				default:break;

				}
				break;
			case 4:
				if(dao.deleteCustomer(cust))
				{

					System.out.println("successful...");
				}
				else
				{
					System.out.println("Failed....");
				}
				break;
			case 5:
				List<Customer> list1=new ArrayList<Customer>();
				list1=dao.getAllCustomers(cust);

				for (Customer customer : list1) {
					System.out.println(customer);

				}
				break;
			case 6:AdminMain.main(null);
						break;
			default:System.out.println("Choose correct choice");
				break;
			}
		}













	}

}
