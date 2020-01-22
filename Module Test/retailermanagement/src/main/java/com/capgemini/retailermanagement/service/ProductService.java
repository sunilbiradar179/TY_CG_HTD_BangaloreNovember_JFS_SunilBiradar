package com.capgemini.retailermanagement.service;

import java.util.List;

import com.capgemini.retailermanagement.dto.Product;
import com.capgemini.retailermanagement.dto.User;

public interface ProductService {
	public User login(User credentials);
	public boolean register(User account);
	public boolean addProduct(Product product);
	public Product getProduct(int userid);
	public List<Product> getAllProducts();
	public boolean modifyUser(String email,String password);


}