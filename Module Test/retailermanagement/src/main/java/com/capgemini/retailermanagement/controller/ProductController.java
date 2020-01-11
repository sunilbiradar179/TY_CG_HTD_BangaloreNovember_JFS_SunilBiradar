package com.capgemini.retailermanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermanagement.dto.Product;
import com.capgemini.retailermanagement.dto.ProductResponse;
import com.capgemini.retailermanagement.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	
	@PostMapping(path = "/add-product",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody Product product)
	{
		ProductResponse response=new ProductResponse();
		
		if(service.addProduct(product))
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added");
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product with same name already exists");
		}
		return response;
		
	}
	
	
	@GetMapping(path = "/view-allproducts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse viewAllProducts() {
		ProductResponse response = new ProductResponse();
		List<Product> list = service.getAllProducts();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Products found");
			response.setProduct(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}
	
	
	@GetMapping(path = "/view-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse viewProduct(@RequestParam("id") int userid) {
		ProductResponse response = new ProductResponse();
		Product product = service.getProduct(userid);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}
	
	

}
