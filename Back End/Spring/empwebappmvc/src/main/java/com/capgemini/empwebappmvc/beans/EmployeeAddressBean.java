package com.capgemini.empwebappmvc.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeeAddress")
public class EmployeeAddressBean 
{
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column(nullable=false)
	private String addtype;
	@Column
	private String add1;
	@Column
	private String add2;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid",referencedColumnName="id")
	private EmployeeBean bean ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeBean getBean() {
		return bean;
	}
	public void setBean(EmployeeBean bean) {
		this.bean = bean;
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
	public String getAddtype() {
		return addtype;
	}
	public void setAddtype(String addtype) {
		this.addtype = addtype;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	
	


}
