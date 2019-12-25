package com.tyss.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlSearchDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		String query="select mname from Movie ";
		Query result=em.createQuery(query);
		List<String> record=result.getResultList();
		
		for (String string : record) {
			System.out.println(string);
		}
		
		
	}

}
