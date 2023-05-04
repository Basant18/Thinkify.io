package Driver;

import java.util.ArrayList;
import java.util.List;

import Models.Flat;
import Models.User;
import Repository.FlatRepo;
import Repository.UserRepo;
import Service.FlatService;

public class Launch {

	public static void main(String[] args) {
		UserRepo userRepo = new UserRepo();
		FlatRepo flatRepo = new FlatRepo();
		FlatService flatService = new FlatService();
		User user1 = new User("Harish","8890233212",flatRepo.getFlatList());
//		userRepo.addUser(user1);
//		System.out.println(userRepo.getUserList().get(0).getName());
		Flat flat1 = new Flat(user1,2500000,4,"Flat","RameshNagar","NewDelhi");
		Flat flat2 = new Flat(user1,3500000,3,"Flat","RajouriGarden","NewDelhi");
		Flat flat3 = new Flat(user1,1500000,2,"Flat","BasaiDarapur","NewDelhi");
		flatService.createFlat(flat1, flatRepo, userRepo);
		flatService.createFlat(flat2, flatRepo, userRepo);
		flatService.createFlat(flat3, flatRepo, userRepo);
//		System.out.println("Name of User => "+user1.getName());
//		System.out.println("ContactNo of User => "+flat1.getUser().getContactNo());
//		System.out.println("Flat details => "+flat1.getAddress()+" "+flat1.getLocation()+" "+flat1.getNoOfRooms()+" "
//				           +flat1.getPrice()+" "+flat1.getType());
//		System.out.println("Flat details => "+flat2.getAddress()+" "+flat2.getLocation()+" "+flat2.getNoOfRooms()+" "
//		           +flat2.getPrice()+" "+flat2.getType());
		for(Flat flat : flatRepo.getFlatList())
		{
			System.out.println("User Details => "+flat.getUser().getName()+" "+flat.getUser().getContactNo());
			System.out.println("Flat Details => "+flat.getAddress()+" "+flat.getLocation()+" "+flat.getNoOfRooms()+" "+
			                   flat.getPrice()+" "+flat.getType());
		}
		System.out.println("----------------------------------------------------------");
		ArrayList<Flat> sortedFlatRepo1 = flatService.filterFlatsByPrice(user1);
		for(Flat flat : sortedFlatRepo1)
		{
			System.out.println("Flat Details => "+flat.getAddress()+" "+flat.getLocation()+" "+flat.getNoOfRooms()+" "+
	                   flat.getPrice()+" "+flat.getType());
		}
		System.out.println("----------------------------------------------------------");
		ArrayList<Flat> sortedFlatRepo2 = flatService.filterFlatsByRooms(user1);
		for(Flat flat : sortedFlatRepo2)
		{
			System.out.println("Flat Details => "+flat.getAddress()+" "+flat.getLocation()+" "+flat.getNoOfRooms()+" "+
	                   flat.getPrice()+" "+flat.getType());
		}

	}

}
