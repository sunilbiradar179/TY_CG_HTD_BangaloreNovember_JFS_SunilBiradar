package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDeleteDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		String query="delete from Movie where mid=102";
		Query result=em.createQuery(query);
		int a=result.executeUpdate();
		et.commit();
		if(a>0)
		{
			System.out.println("Deleted.....");
		}
		else
		{
			System.err.println("Something went wrong");
		}

	}

}
