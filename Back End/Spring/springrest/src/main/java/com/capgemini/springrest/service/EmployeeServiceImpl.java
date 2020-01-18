package com.capgemini.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.springrest.dao.EmployeeDAO;
import com.capgemini.springrest.dto.EmployeeAddressBean;
import com.capgemini.springrest.dto.EmployeeBean;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeDAO dao;
	
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();//for encoding
	
	@Override
	public EmployeeBean auth(String email, String password) {
		
		return dao.auth(email,password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
	
	String encodedPassword=encoder.encode(bean.getPassword());
	bean.setPassword(encodedPassword);
		
		
		List<EmployeeAddressBean> addressbean=bean.getAddressBeans();
		for (EmployeeAddressBean employeeAddressBean : addressbean) {
			employeeAddressBean.setBean(bean);
			
		}
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getEmployees(String key) {
		
		return dao.getEmployees(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		
		return dao.changePassword(id, encoder.encode(password));
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

}
