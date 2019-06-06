package hibernate.practice;

public class Profile {
	private int pid;
	private String lang;
	private String exp;
	private User user;
	
	




public Profile() {}

public Profile(String lang, String exp) {
	super();
	//this.pid=pid;
	this.lang = lang;
	this.exp = exp;
}


public int getPid() {
	return pid;
}




public void setPid(int pid) {
	this.pid = pid;
}



public String getLang() {
	return lang;
}


public void setLang(String lang) {
	this.lang = lang;
}


public String getExp() {
	return exp;
}


public void setExp(String exp) {
	this.exp = exp;
}

public User getUser() {
	return user;
}




public void setUser(User user) {
	this.user = user;
}


}
