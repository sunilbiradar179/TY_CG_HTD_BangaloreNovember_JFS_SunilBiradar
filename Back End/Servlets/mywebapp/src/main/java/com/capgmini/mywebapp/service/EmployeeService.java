package com.capgmini.mywebapp.service;

import java.util.List;

import com.capgmini.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeService 
{
	public EmployeeInfoBean searchEmployee(int empId);
	
	public EmployeeInfoBean authenticate(int empId,String password);
	
	public boolean deleteEmployee(int empId);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public List<EmployeeInfoBean> getAllEmployees();

}
