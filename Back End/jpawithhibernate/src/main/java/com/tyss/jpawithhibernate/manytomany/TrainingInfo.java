package com.tyss.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tyss.jpawithhibernate.onetoone.EmpInfo;

@Entity
@Table(name="TrainingInfo")
public class TrainingInfo
{
	@Id
	@Column
	private int tid;
	@Column
	private String tname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Training_Employee", 
	joinColumns=@JoinColumn(name="tid"), //tid should write first because it is in same program
	inverseJoinColumns=@JoinColumn(name="eid"))
	private List<EmpInfo> list;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<EmpInfo> getList() {
		return list;
	}

	public void setList(List<EmpInfo> list) {
		this.list = list;
	}
	
	

}
