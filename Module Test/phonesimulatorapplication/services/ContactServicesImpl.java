package com.capgemini.phonesimulatorapplication.services;

import java.util.List;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;
import com.capgemini.phonesimulatorapplication.dao.ContactDAO;
import com.capgemini.phonesimulatorapplication.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices {

	ContactDAO dao = ContactFactory.instanceOfContactDAOImpl();

	@Override
	public List<ContactInfo> getAllContact() {
		// TODO Auto-generated method stub
		return dao.getAllContact();
	}

	@Override
	public ContactInfo getContact(String name) {
		// TODO Auto-generated method stub
		return dao.getContact(name);
	}

	@Override
	public boolean updateContact(ContactInfo con) {
		// TODO Auto-generated method stub
		return dao.updateContact(con);
	}

	@Override
	public boolean deleteContact(ContactInfo con) {
		// TODO Auto-generated method stub
		return dao.deleteContact(con);
	}

	@Override
	public boolean addContact(ContactInfo con) {
		// TODO Auto-generated method stub
		return dao.addContact(con);
	}

}
