package com.tyss.fms.bean;

import java.io.Serializable;

public class Contractor implements Serializable
{
	private int contarctno;
	private int contractid;
	private int productid;
	private int haulierid;
	private int deliverydate;
	private String deliveryday;
	private int quantity;
	public int getContarctno() {
		return contarctno;
	}
	public void setContarctno(int contarctno) {
		this.contarctno = contarctno;
	}
	public int getcontractid() {
		return contractid;
	}
	public void setcontractid(int contractid) {
		this.contractid = contractid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getHaulierid() {
		return haulierid;
	}
	public void setHaulierid(int haulierid) {
		this.haulierid = haulierid;
	}
	public int getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(int deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getDeliveryday() {
		return deliveryday;
	}
	public void setDeliveryday(String deliveryday) {
		this.deliveryday = deliveryday;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Contractor [contarctno=" + contarctno + ", contractid=" + contractid + ", productid=" + productid
				+ ", haulierid=" + haulierid + ", deliverydate=" + deliverydate + ", deliveryday=" + deliveryday
				+ ", quantity=" + quantity + "]";
	}
	
	
	

}
