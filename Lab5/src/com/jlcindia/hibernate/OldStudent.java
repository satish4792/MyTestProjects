package com.jlcindia.hibernate;

public class OldStudent extends Student {
	private String ocompany;
	private String ocemail;
	private double octc;
	public OldStudent() {}
	public OldStudent(String city, String sname, String status, double totfee,
			String ocompany,String ocemail, double octc) {
		super(city, sname, status, totfee);
		this.ocompany = ocompany;
		this.ocemail = ocemail;
		this.octc = octc;
	}
	public String getOcompany() {
		return ocompany;
	}
	public void setOcompany(String ocompany) {
		this.ocompany = ocompany;
	}
	
	public String getOcemail() {
		return ocemail;
	}
	public void setOcemail(String ocemail) {
		this.ocemail = ocemail;
	}
	public double getOctc() {
		return octc;
	}
	public void setOctc(double octc) {
		this.octc = octc;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t"+ocompany+"\t"+ocemail+"\t"+octc;
	}
}
