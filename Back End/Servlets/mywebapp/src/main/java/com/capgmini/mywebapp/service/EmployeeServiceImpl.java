package com.capgmini.mywebapp.service;

import java.util.List;

import com.capgmini.mywebapp.beans.EmployeeInfoBean;
import com.capgmini.mywebapp.dao.EmployeeDao;
import com.capgmini.mywebapp.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao dao=new EmployeeDaoImpl();

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(empId);
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(empId, password);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empId);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employeeInfoBean);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(employeeInfoBean);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}
	

}
