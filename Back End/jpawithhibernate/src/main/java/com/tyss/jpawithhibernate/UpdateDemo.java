package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class UpdateDemo 
{
	public static void main(String[] args) {
		//Movie movie=new Movie();
		
		EntityManager em=null;
		EntityTransaction et=null;
		
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			Movie record=em.find(Movie.class, 102);
			 record.setMname("Avengers");
			 System.out.println("record update");
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}

}
