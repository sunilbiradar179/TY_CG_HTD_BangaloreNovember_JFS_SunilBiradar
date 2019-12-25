package com.tyss.fms.bean;

public class Customer
{
	private int custId;
	private String custName;
	private String address1;
	private String addres2;
	private String town;
	private int postalCode;
	private String email;
	private int phone;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddres2() {
		return addres2;
	}
	public void setAddres2(String addres2) {
		this.addres2 = addres2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address1=" + address1 + ", addres2="
				+ addres2 + ", town=" + town + ", postalCode=" + postalCode + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
	
	

}
