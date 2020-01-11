package com.capgemini.retailermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.retailermanagement.dao.ProductDAO;
import com.capgemini.retailermanagement.dto.Product;
import com.capgemini.retailermanagement.dto.User;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO dao;

	@Override
	public User login(User credentials) {
		// TODO Auto-generated method stub
		return dao.login(credentials);
	}

	@Override
	public boolean register(User account) {
		// TODO Auto-generated method stub
		return dao.register(account);
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public Product getProduct(int userid) {
		// TODO Auto-generated method stub
		return dao.getProduct(userid);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	@Override
	public boolean modifyUser(String email, String password) {
		// TODO Auto-generated method stub
		return dao.modifyUser(email, password);
	}

}
