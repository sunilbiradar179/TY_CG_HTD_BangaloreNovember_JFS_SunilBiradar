package com.capgemini.phonesimulatorapplication.bean;

import java.io.Serializable;

public class ContactInfo implements Serializable
{
	private String name;
	private long number;
	private String groups;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long l) {
		this.number = l;
	}
	public String getGroups() {
		return groups;
	}
	public void setGroups(String groups) {
		this.groups = groups;
	}
	@Override
	public String toString() {
		return "ContactInfo [name=" + name + ", number=" + number + ", groups=" + groups + "]";
	}
	
	
	
	

}
