package com.tyss.jpawithhibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.onetoone.EmpInfo;

public class InsertManyToMany {

	public static void main(String[] args) {
			
		EmpInfo emp3=new EmpInfo();
		emp3.setEid(455);
		emp3.setEname("ajay");
		emp3.setEmail("ajay@gmail");
		emp3.setPassword("poiuy");
		
		EmpInfo emp4=new EmpInfo();
		emp4.setEid(2222);
		emp4.setEname("ajith");
		emp4.setEmail("ajith@gmail");
		emp4.setPassword("asdf");
		
		List<EmpInfo> list1=new ArrayList<EmpInfo>();
		list1.add(emp3);
		list1.add(emp4);
		
		TrainingInfo tr=new TrainingInfo();
		tr.setTid(515);
		tr.setTname("rohit");
		tr.setList(list1);
		
		
		
		
		
		
		EntityManager em=null;
		EntityTransaction et=null;


		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(tr);
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
