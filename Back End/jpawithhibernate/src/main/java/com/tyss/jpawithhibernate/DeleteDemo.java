package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class DeleteDemo 
{
	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction et=null;
		
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			Movie record=em.find(Movie.class, 101);
			em.remove(record);
			System.out.println("record removed");
			et.commit();
			
		} catch (Exception e) {
		e.printStackTrace();
		et.rollback();
		}
		em.close();
	}

}
