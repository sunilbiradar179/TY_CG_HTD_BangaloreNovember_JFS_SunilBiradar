package com.capgemini.retailermanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermanagement.dto.Product;
import com.capgemini.retailermanagement.dto.User;
import com.capgemini.retailermanagement.exception.ProductException;
@Repository
public class ProductDAOImpl implements  ProductDAO{
	
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public User login(User credentials) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from User where email=:email";
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		query.setParameter("email", credentials.getEmail());
		try {
			User account = query.getSingleResult();
			if (account.getPassword().equals(credentials.getPassword())) {
				return account;
			} else {
				System.out.println("Enter valid email");
				return null;
			}
		} catch (Exception e) {
			throw new ProductException("Account does not exist");
		}
	
	}

	@Override
	public boolean register(User account) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(account);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new ProductException("Account with same email already exists");
		}
	}

	@Override
	public boolean addProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	
	}

	@Override
	public Product getProduct(int userid) {
		EntityManager manager = factory.createEntityManager();
		Product product = manager.find(Product.class, userid);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from Product";
		TypedQuery<Product> query = manager.createQuery(getall, Product.class);
		return query.getResultList();
	}

	@Override
	public boolean modifyUser(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		User user=manager.find(User.class, email);
		EntityTransaction transaction=manager.getTransaction();
		
		if(user!=null)
		{
			transaction.begin();
			user.setPassword(password);
			transaction.commit();
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
