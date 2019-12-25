package com.tyss.fms.bean.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.fms.bean.Client;
import com.tyss.fms.bean.Customer;

public class ClientDAOImpl implements ClientDAO{

	
	Scanner sc=new Scanner(System.in);
	List<Client> list=new ArrayList<Client>();
	@Override
	public List<Client> getAllClient(Client client) {
	
		return list;
	}

	@Override
	public boolean insertClient(Client client) {
		list.add(client);
		return true;
	}

	@Override
	public boolean deleteClient(Client client) {
		System.out.println("enter the index");
		int index=sc.nextInt();
		list.remove(index);
		return true;
	}

	@Override
	public List<Client> searchClient(Client client) {
		System.out.println("enter the index");
		int index=sc.nextInt();
		list.get(index);
		return list;
	}

}
