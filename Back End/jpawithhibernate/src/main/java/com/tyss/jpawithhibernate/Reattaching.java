package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class Reattaching 
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
			System.out.println("------Before detach()--------");
			System.out.println(em.contains(record));
			
			em.detach(record);//detaching the record object,there will be no relation 
			System.out.println("---------------after detach()-----------");
			System.out.println(em.contains(record));
			Movie reattachRecord=em.merge(record);//here we are reattaching record object with merge method and storing into Movie reference
			reattachRecord.setMname("panipath");//now we can update after reattching
			System.out.println();
			System.out.println("updated");
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
	

}
