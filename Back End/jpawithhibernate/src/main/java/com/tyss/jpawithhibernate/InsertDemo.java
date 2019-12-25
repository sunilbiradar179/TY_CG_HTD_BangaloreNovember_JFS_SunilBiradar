package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class InsertDemo
{
	public static void main(String[] args) {
		Movie movie=new Movie();
		movie.setMid(101);
		movie.setMname("ABCD");
		movie.setRating("Good");

		EntityManager em=null;
		EntityTransaction et=null;


		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(movie);
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


