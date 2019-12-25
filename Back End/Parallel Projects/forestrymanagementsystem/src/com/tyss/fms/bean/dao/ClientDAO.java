package com.tyss.fms.bean.dao;

import java.util.List;

import com.tyss.fms.bean.Client;
import com.tyss.fms.bean.Customer;

public interface ClientDAO {
	public List<Client> getAllClient(Client client);
	public boolean insertClient(Client client);
	public boolean deleteClient(Client client);
	public  List<Client> searchClient(Client client);
}
