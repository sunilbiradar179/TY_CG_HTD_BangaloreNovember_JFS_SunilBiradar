package com.capgemini.empwebappmvc.service;

import java.util.List;

import com.capgemini.empwebappmvc.beans.EmployeeBean;

public interface EmployeeService {
	public EmployeeBean auth(String email,String password);
	public boolean register(EmployeeBean bean);
	public List<EmployeeBean> getEmployees(String key);
	public boolean changePassword(int id,String password);

}
