package com.tyss.fms.bean;

import java.io.Serializable;

public class Client implements Serializable {
	private int cid;
	private String name;
	private String address;
	private String phone;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Client [cid=" + cid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
}
