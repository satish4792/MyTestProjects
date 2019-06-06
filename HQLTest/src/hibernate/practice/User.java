package hibernate.practice;

import java.util.Collection;


public class User {

	private int uid;
	private String uname;
	private String email;
	
	private Profile profiles;
	private Collection<Address> address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String uname, String email) {
		super();
		this.uname = uname;
		this.email = email;
		//this.profiles = profiles;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Profile getProfiles() {
		return profiles;
	}

	public void setProfiles(Profile profiles) {
		this.profiles = profiles;
	}

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		
		return uid+" , "+uname+" , "+email;
	}
}
