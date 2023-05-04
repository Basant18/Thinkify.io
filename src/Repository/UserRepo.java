package Repository;

import java.util.ArrayList;
import java.util.List;

import Models.User;

public class UserRepo {
	private List<User> userList;
	
	public UserRepo()
	{
		this.userList = new ArrayList<User>();
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public void addUser(User user)
	{
		this.userList.add(user);
	}
	
	public User getUserByName(String name)
	{
		for(User user : userList)
		{
			if(user.getName().equals(name) == true)
			{
				return user;
			}
		}
		return null;
	}
	
	public User getUserByContactNo(String contactNo)
	{
		for(User user : userList)
		{
			if(user.getName().equals(contactNo) == true)
				return user;
		}
		return null;
	}
}
