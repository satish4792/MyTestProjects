package com.jlcindia.hibernate;

public class WeekdayStudent extends CurrentStudent {
	private String qualification;
	private String percentage;
	private int yop;
	public WeekdayStudent() {}
	public WeekdayStudent(String city, String sname, String status,
			double totfee, double feebal, String timings, String branch,
			String qualification, String percentage, int yop) {
		super(city, sname, status, totfee, feebal, timings, branch);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\t"+qualification+"\t"+percentage+"\t"+yop;
	}

}
