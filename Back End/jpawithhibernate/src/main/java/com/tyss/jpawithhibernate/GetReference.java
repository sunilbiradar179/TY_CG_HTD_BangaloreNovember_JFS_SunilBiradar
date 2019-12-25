package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class GetReference 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		
	Movie record=em.find(Movie.class, 102);
	System.out.println(record.getClass());
	//Movie record=em.getReference(Movie.class, 101);
	//System.out.println("id:"+record.getMid());
	//System.out.println("name:"+record.getMname());
	//System.out.println("Rating:"+record.getRating());
	em.close();

	}

}
