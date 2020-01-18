package com.capgemini.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.dto.EmployeeBean;
import com.capgemini.springrest.dto.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path="/auth",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	private  EmployeeResponse auth(@RequestBody EmployeeBean bean)
	{
		EmployeeBean employeebean= service.auth(bean.getEmail(), bean.getPassword());
		EmployeeResponse response=new EmployeeResponse();
		if(employeebean!=null)
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee found for the credentials");
			
			response.setBeans(Arrays.asList(employeebean));
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Invalid credentials");
		}
		return response;
	}
	@PostMapping(path="/register",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	private EmployeeResponse register(@RequestBody EmployeeBean bean)
	{
		EmployeeResponse response=new EmployeeResponse();
		
		if(service.register(bean))
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Registered Successfully");
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Email Already Exists");
		}
	return response;
	}
	@GetMapping(path="/get",produces=MediaType.APPLICATION_JSON_VALUE)
	private EmployeeResponse searchEmployee(String key)
	{
		EmployeeResponse response=new EmployeeResponse();
		List<EmployeeBean> beans=service.getEmployees(key);
		if(beans.isEmpty()) 
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee not found");
		}
		else
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Searched");
			
		}
		return response;
	}
	@PutMapping(path="/change-password",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse changePassword(@RequestBody EmployeeBean bean)
	{
		EmployeeResponse response=new EmployeeResponse();

		if(service.changePassword(bean.getId(), bean.getPassword()))
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password Changed Successfully");
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" password not changed");

		}
		return response;
	}
	
	
	
	@DeleteMapping(path="/delete/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteemployee(@PathVariable("id")int id)
	{
		EmployeeResponse response=new EmployeeResponse();
		
		service.deleteEmployee(id);
	
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Details Deleted");
			
		
		
		
		return response;
	}
}
