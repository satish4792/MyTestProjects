package com.jlcindia.hibernate;

public class Student {
	private int sid;
	private String city;
	private String sname;
	private String status;
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
