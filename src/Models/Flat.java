package Models;

public class Flat {
	User user;
	double price;
	int noOfRooms;
	String type;
	String address;
	String location;
	
	public Flat(User user,double price,int noOfRooms,String type,String address,String location)
	{
		this.user = user;
		this.price = price;
		this.noOfRooms = noOfRooms;
		this.type = type;
		this.address = address;
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
