package Service;

import java.util.ArrayList;
import java.util.List;

import Models.Flat;
import Models.User;
import Repository.FlatRepo;
import Repository.UserRepo;

public class FlatService {
	public String createFlat(Flat flat,FlatRepo flatRepo,UserRepo userRepo)
	{
		flatRepo.addFlat(flat);
		for(User user : userRepo.getUserList())
		{
			if(user.getName().equals(flat.getUser().getName()) == true)
			{
				List<Flat> flatList = user.getFlatList();
				flatList.add(flat);
				user.setFlatList(flatList);
				return "Flat has been successfully created";
			}
		}
		String name = flat.getUser().getName();
		String contactNo = flat.getUser().getContactNo();
		List<Flat> flatList = new ArrayList<>();
		flatList.add(flat);
		User user = new User(name,contactNo,flatList);
		userRepo.addUser(user);
		return "Flat has been successfully created";
	}
	
	public ArrayList<Flat> filterFlatsByPrice(User user)
	{
		ArrayList<Flat> flatList = (ArrayList<Flat>) user.getFlatList();
		flatList.sort((f1,f2) -> Double.compare(f1.getPrice(),f2.getPrice()));
		return flatList;
	}
	
	public ArrayList<Flat> filterFlatsByRooms(User user)
	{
		ArrayList<Flat> flatList = (ArrayList<Flat>) user.getFlatList();
		flatList.sort((f1,f2) -> Integer.compare(f1.getNoOfRooms(), f2.getNoOfRooms()));
		return flatList;
	}
}
