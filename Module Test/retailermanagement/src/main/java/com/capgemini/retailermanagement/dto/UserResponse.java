package com.capgemini.retailermanagement.dto;

import java.util.List;



public class UserResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<User> account;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<User> getAccount() {
		return account;
	}
	public void setAccount(List<User> account) {
		this.account = account;
	}
	
	

}
