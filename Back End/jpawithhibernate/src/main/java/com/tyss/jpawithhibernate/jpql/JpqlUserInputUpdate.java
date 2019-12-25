package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlUserInputUpdate
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		String  query="update Movie set mname=:nm where mid=:id";
		Query resultquery=em.createQuery(query);
		resultquery.setParameter("id", 101);
		resultquery.setParameter("nm", "ABCD");
		
		int count=resultquery.executeUpdate();
		if(count>0)
		{
		System.out.println("updated");
		}
		else
		{
			System.err.println("Something went wrong");
		}
		et.commit();
		
	}

}
