package com.capgemini.retailermanagement.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermanagement.dto.User;
import com.capgemini.retailermanagement.dto.UserResponse;
import com.capgemini.retailermanagement.service.ProductService;

@RestController
public class UserController {
	
	@Autowired
	ProductService service;
	
	@PostMapping(path = "/register",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse register(@RequestBody User account)
	{
		UserResponse response=new UserResponse();
		service.register(account);
		response.setStatusCode(201);
		response.setDescription("Success");
		response.setMessage("Account created/registered");
		return response;
	}
	
	@PostMapping(path = "/login",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@RequestBody User credentials) {
		UserResponse response=new UserResponse();
		
		User account=service.login(credentials);
		if (account != null) {
			response.setStatusCode(201);
			response.setDescription("Success");
			response.setMessage("Logged in");
			response.setAccount(Arrays.asList(account));
		} else {
			response.setStatusCode(405);
			response.setDescription("Failure");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}
	
	@PutMapping(path="/modify-user",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse modifyUser(@RequestBody User user) {
		UserResponse response=new UserResponse();
		
		if(service.modifyUser(user.getEmail(), user.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password updated");
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User not found");
		}
		return response;
	}
	
	

}
