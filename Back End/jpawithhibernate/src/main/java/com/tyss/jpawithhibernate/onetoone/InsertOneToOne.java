package com.tyss.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertOneToOne {

	public static void main(String[] args) {
		EmpInfo emp=new EmpInfo();
		emp.setEid(11);
		emp.setEname("sunil");
		emp.setEmail("sunil@gmail.com");
		emp.setPassword("password");
		
		EmpPersonalInfo ep= new EmpPersonalInfo();
		ep.setPid(101);
		ep.setAdhar_no(123456);
		ep.setFname("sachin");
		ep.setMname("asha");
		ep.setEmpinfo(emp);
		
		EntityManager em=null;
		EntityTransaction et=null;


		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(ep);
			
			//EmpInfo emp1=em.find(EmpInfo.class, 10);//this is logic for bidirectional 
			//System.out.println(emp1.getInfo().getAdhar_no());
			
			
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
