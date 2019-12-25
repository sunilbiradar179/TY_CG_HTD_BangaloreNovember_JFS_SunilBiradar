package com.capgemini.phonesimulatorapplication.dao;

import java.util.List;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;

public interface ContactDAO {
	public List<ContactInfo> getAllContact();

	public ContactInfo getContact(String name);

	public boolean updateContact(ContactInfo con);

	public boolean deleteContact(ContactInfo con);

	public boolean addContact(ContactInfo con);

}
