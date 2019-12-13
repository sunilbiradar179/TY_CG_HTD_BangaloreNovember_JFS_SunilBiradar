package com.capgemini.phonesimulatorapplication.services;

import java.util.List;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;

public interface ContactServices 
{
	public List<ContactInfo> getAllContact();
	public String getContact(String name);
	public boolean updateContact(ContactInfo  con);
	public boolean deleteContact(ContactInfo con);
	public boolean addContact(ContactInfo con);

}
