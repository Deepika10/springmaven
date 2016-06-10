package com.aartek.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Recharge")
public class Recharge 
{
	@Id
	@Column (name="id")
	private int id;
	
	@Column (name="Date")
	private String  date;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column (name="mobile_no")
	private long Mobileno;
	
	@Column (name="vendor")
	private String Vendor;
	
	@Column (name="amount")
	private int Amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public long getMobileno() {
		return Mobileno;
	}

	public void setMobileno(long mobileno) {
		Mobileno = mobileno;
	}

	public String getVendor() {
		return Vendor;
	}

	public void setVendor(String vendor) {
		Vendor = vendor;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

}
