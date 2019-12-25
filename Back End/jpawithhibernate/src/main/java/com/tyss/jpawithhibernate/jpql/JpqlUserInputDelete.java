package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlUserInputDelete {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		String  query="delete from Movie where mid=:id";
		Query resultquery=em.createQuery(query);
		resultquery.setParameter("id", 101);
		
		
		int count=resultquery.executeUpdate();
		if(count>0)
		{
		System.out.println("deleted");
		}
		else
		{
			System.err.println("Something went wrong");
		}
		et.commit();

	}

}
