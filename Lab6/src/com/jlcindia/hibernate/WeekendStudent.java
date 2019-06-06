package com.jlcindia.hibernate;

public class WeekendStudent extends CurrentStudent {
	private String wcompany;
	private String wcemail;
	private double wctc;
	public WeekendStudent() {}
	public WeekendStudent(String city, String sname, String status,
			double totfee, double feebal, String timings, String branch,
			String wcompany, String wcemail, double wctc) {
		super(city, sname, status, totfee, feebal, timings, branch);
		this.wcompany = wcompany;
		this.wcemail = wcemail;
		this.wctc = wctc;
	}
	public String getWcompany() {
		return wcompany;
	}
	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}
	public String getWcemail() {
		return wcemail;
	}
	public void setWcemail(String wcemail) {
		this.wcemail = wcemail;
	}
	public double getWctc() {
		return wctc;
	}
	public void setWctc(double wctc) {
		this.wctc = wctc;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\t"+wcompany+"\t"+wcemail+"\t"+wctc;
	}

}
