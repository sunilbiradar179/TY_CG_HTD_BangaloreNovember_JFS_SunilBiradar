package com.tyss.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmpPersonalInfo")
public class EmpPersonalInfo 
{
	@Id
	@Column
	private int pid;
	@Column
	private int adhar_no;
	@Column
	private String fname;
	@Column
	private String mname;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmpInfo empinfo;


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public int getAdhar_no() {
		return adhar_no;
	}


	public void setAdhar_no(int adhar_no) {
		this.adhar_no = adhar_no;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public EmpInfo getEmpinfo() {
		return empinfo;
	}


	public void setEmpinfo(EmpInfo empinfo) {
		this.empinfo = empinfo;
	}
	
	
	

}
