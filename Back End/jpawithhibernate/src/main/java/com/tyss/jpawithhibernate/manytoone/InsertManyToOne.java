package com.tyss.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.onetoone.EmpInfo;

public class InsertManyToOne 
{
	public static void main(String[] args) {
		EmpInfo emp=new EmpInfo();
		emp.setEid(13);
		emp.setEname("sathya");
		emp.setEmail("sathya@gmail.com");
		emp.setPassword("qwerty");
		
		EmpExperiance exp=new EmpExperiance();
		exp.setExpId(1000);
		exp.setCname("TCS");
		exp.setDuration(2);
		exp.setEmpinfo(emp);
		
		EmpExperiance exp1=new EmpExperiance();
		exp1.setExpId(1001);
		exp1.setCname("infosys");
		exp1.setDuration(2);
		exp1.setEmpinfo(emp);
		
		EntityManager em=null;
		EntityTransaction et=null;


		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(exp);
			em.persist(exp1);
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
