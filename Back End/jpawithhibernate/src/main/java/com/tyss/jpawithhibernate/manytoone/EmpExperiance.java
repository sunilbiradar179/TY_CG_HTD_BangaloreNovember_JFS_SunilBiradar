package com.tyss.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tyss.jpawithhibernate.onetoone.EmpInfo;

@Entity
@Table(name="EmpExperiance")
public class EmpExperiance 
{
	@Id
	@Column
	private int expId;
	@Column
	private String Cname;
	@Column
	private int duration;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmpInfo empinfo;

	public int getExpId() {
		return expId;
	}

	public void setExpId(int expId) {
		this.expId = expId;
	}

	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public EmpInfo getEmpinfo() {
		return empinfo;
	}

	public void setEmpinfo(EmpInfo empinfo) {
		this.empinfo = empinfo;
	}
	
	

}
