package com.tyss.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//this shows the entity class
@Table(name="Movie")//this is used for connecting table to entity class
public class Movie {
	
	
	@Id//this annotation is for primary key
	@Column//this annotation is for connecting variables to columns
	private int mid;
	@Column
	private String mname;
	@Column
	private String rating;
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", rating=" + rating + "]";
	}
	

}
