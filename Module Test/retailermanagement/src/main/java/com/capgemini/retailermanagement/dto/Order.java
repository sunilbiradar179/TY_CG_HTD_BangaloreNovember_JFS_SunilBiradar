package com.capgemini.retailermanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class Order {
	
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private int product_id;
	@Column
	private int user_id;

}
