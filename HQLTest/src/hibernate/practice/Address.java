package hibernate.practice;

public class Address {
    private int aid;
	private String street;
	private String city;
	private String state;
	private User user;
	
	public Address() {
		
	}
	
	

	public Address(String street, String city, String state) {
		super();
		//this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
	}



	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return street+" , "+city+" , "+state;
	}
		
}
