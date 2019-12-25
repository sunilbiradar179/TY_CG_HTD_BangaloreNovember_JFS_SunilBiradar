package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlInsertDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		String query="insert into Movie(mid,mname,rating) values (102,'Shandar','Worst')";
		Query result=em.createNativeQuery(query);
		int a=result.executeUpdate();
		et.commit();
		
		if(a>0)
		{
			System.out.println("Inserted");
		}
		else
		{
			System.err.println("Something went wrong");
		}

	}

}
