package Repository;

import java.util.ArrayList;
import java.util.List;

import Models.Flat;

public class FlatRepo {
	private List<Flat> flatList;
	
	public FlatRepo()
	{
		this.flatList = new ArrayList<Flat>();
	}

	public List<Flat> getFlatList() {
		return flatList;
	}

	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}
	
	public void addFlat(Flat flat)
	{
		this.flatList.add(flat);
	}
	
	
}
