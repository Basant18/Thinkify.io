package Models;

import java.util.List;

public class Booking {
	String forSaleOrRent;
	List<Flat> flatList;
	
	public Booking(String forSaleOrRent,List<Flat> flatList)
	{
		this.forSaleOrRent = forSaleOrRent;
		this.flatList = flatList;
	}

	public String getForSaleOrRent() {
		return forSaleOrRent;
	}

	public void setForSaleOrRent(String forSaleOrRent) {
		this.forSaleOrRent = forSaleOrRent;
	}

	public List<Flat> getFlatList() {
		return flatList;
	}

	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}

}
