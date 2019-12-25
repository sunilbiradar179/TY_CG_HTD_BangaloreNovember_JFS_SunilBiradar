package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlUpdateDemo {

	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		String query="update Movie set mname='sahoo' where mname='Bahubali'";
		Query resultquery=em.createQuery(query);
		int a=resultquery.executeUpdate();
		et.commit();
		if(a!=0)
		{
			System.out.println("updated...");
		}
		else
		{
			System.err.println("Something went wrong");
		}

	}

}
