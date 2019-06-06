package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="mystudents")
@Inheritance(strategy=InheritanceType.JOINED)
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	
	@Column(name="city")
	private String city;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="status")
	private String status;
	
	@Column(name="totfee")
	private double totfee;
	
	public Student() {
		
	}

	public Student(String city, String sname, String status, double totfee) {
		super();
		this.city = city;
		this.sname = sname;
		this.status = status;
		this.totfee = totfee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotfee() {
		return totfee;
	}

	public void setTotfee(double totfee) {
		this.totfee = totfee;
	}
	
	
	@Override
	public String toString() {
		
		return ""+sid+"\t"+sname+"\t"+city+"\t"+status+"\t"+totfee;
	}

}
