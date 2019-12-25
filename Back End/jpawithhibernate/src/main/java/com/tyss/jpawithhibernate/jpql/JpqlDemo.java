package com.tyss.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithhibernate.dto.Movie;

public class JpqlDemo
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		String query="from Movie";
		Query resultquery=em.createQuery(query);
		List<Movie> record=resultquery.getResultList();
		
		for (Movie movie : record) 
		{
			System.out.println("Movie id="+movie.getMid());
			System.out.println("Movie name="+movie.getMname());
			System.out.println("Movie rating"+movie.getRating());
			System.out.println("---------------------------------");
		}

	}

}
