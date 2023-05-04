package Models;

import java.util.List;

public class User {
	String name;
	String contactNo;
	List<Flat> flatList;
	public User(String name,String contactNo,List<Flat> flatList)
	{
		this.name = name;
		this.contactNo = contactNo;
		this.flatList = flatList;
	}
	public List<Flat> getFlatList() {
		return flatList;
	}
	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
