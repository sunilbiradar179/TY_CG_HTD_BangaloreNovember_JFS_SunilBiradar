package com.tyss.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="EmpInfo")
public class EmpInfo {
		@Id
		@Column
		private int eid;
		
		@Column
		private String ename;
		@Column
		private String email;
		@Column
		private String password;
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		@OneToOne(cascade=CascadeType.ALL,mappedBy="empinfo")//empinfo is got from   EmpPersonalInfo class where we created object of EmpInfo
		private EmpPersonalInfo info;//for bidirectional
		public EmpPersonalInfo getInfo() {
			return info;
		}
		public void setInfo(EmpPersonalInfo info) {
			this.info = info;
		}
		



}
