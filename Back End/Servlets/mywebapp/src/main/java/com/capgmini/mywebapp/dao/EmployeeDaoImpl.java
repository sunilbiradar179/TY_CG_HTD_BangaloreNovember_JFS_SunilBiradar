package com.capgmini.mywebapp.dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgmini.mywebapp.beans.EmployeeInfoBean;

public class EmployeeDaoImpl implements EmployeeDao  {

	
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		EntityManager em=emf.createEntityManager();
		EmployeeInfoBean ebean=em.find(EmployeeInfoBean.class, empId);
	
		em.close();
		return ebean;
	
	}
	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager em=emf.createEntityManager();
		String jpql="from EmployeeInfoBean where empId=:empId and password=:pwd";
		
		javax.persistence.Query query=em.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", password);
		
		EmployeeInfoBean employeeInfoBean=null;
		try {
			employeeInfoBean=(EmployeeInfoBean) query.getSingleResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		
		return employeeInfoBean;
	}
	@Override
	public boolean deleteEmployee(int empId) {
		boolean isDeleted=false;
		EntityManager em=emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean=em.find(EmployeeInfoBean.class, empId);
		
		
		EntityTransaction et=null;
		if(employeeInfoBean!=null)
		{
		 et=em.getTransaction();
		et.begin();
		em.remove(employeeInfoBean);
		et.commit();
		isDeleted=true;
		}
		em.close();
		return isDeleted;
	}
	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isAdded=false;
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=null;
		try {
			et=em.getTransaction();
			et.begin();
			em.persist(employeeInfoBean);
			et.commit();
			isAdded=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return isAdded;
	}
	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated=false;
		EntityManager em=emf.createEntityManager();
		EmployeeInfoBean existingEmployeeInfo=em.find(EmployeeInfoBean.class, employeeInfoBean.getEmpId());
		
		EntityTransaction transaction=em.getTransaction();
		
		if(existingEmployeeInfo !=null)
		{
			try {
				transaction.begin();
				String newName=employeeInfoBean.getName().trim();
				if(newName!=null && !newName.isEmpty())
				{
					employeeInfoBean.setName(newName);
				}
				
				int newAge=employeeInfoBean.getAge();
				if(newAge>18)
				{
					employeeInfoBean.setAge(newAge);
				}
				
				double newSalary=employeeInfoBean.getSalary();
				if(newSalary>18)
				{
					employeeInfoBean.setSalary(newSalary);
				}
				
				String newDesignation=employeeInfoBean.getDesignation().trim();
				if(newDesignation!=null && !newDesignation.isEmpty())
				{
					employeeInfoBean.setDesignation(newDesignation);
				}
				
				String newPassword=employeeInfoBean.getPassword().trim();
				if(newPassword!=null && !newPassword.isEmpty())
				{
					employeeInfoBean.setPassword(newPassword);
				}
				transaction.commit();
				isUpdated=true;
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		em.close();
		return isUpdated;
		
	}
	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager em=emf.createEntityManager();
		String jpql="from EmployeeInfoBean";
		javax.persistence.Query query=em.createQuery(jpql);
		List<EmployeeInfoBean> employeeList=query.getResultList();
		
		
		em.close();
		return employeeList;
	}

}
