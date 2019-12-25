package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;
import com.tyss.jpawithhibernate.dto.Product;

public class InsertProduct
{
	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.setId(10);
		p1.setName("alexa");


		EntityManager em=null;
		EntityTransaction et=null;


		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(p1);
			System.out.println("record saved");
			et.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}

}
