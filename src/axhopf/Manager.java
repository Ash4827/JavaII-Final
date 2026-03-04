package axhopf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager {
	
	private ArrayList<HistoricalFigure> figures = new ArrayList<HistoricalFigure>(); //historical figures list
	
	public ArrayList<HistoricalFigure> getArray()
	{
		return this.figures;
	}
	
	
	public void print(ArrayList<Resource> info) //print function for resource arrays
	{
		for(Resource item : info)
		{
			System.out.println(item);
		}
	}
	
	public ArrayList<Resource> conversion(List<String> data) //converts a list of List<Strings> and puts them into an arraylist of type resource
	{
		ArrayList<Resource> list = new ArrayList<>();
		for(String item : data)
		{
			list.add(new Resource(item));
		}
		
		return list;
	}
	
	public void addFigure(HistoricalFigure figure)
	{
		figures.add(figure);
	}

	public void printFigures()
	{
		for(HistoricalFigure figure : figures)
		{
			System.out.println(figure.getName());
		}
	}
	
	public <T extends Resource> int searchArray(ArrayList<T> arrayList, T target) //Generic method for searching array lists
	{
		Collections.sort(arrayList);
		int index = Collections.binarySearch(arrayList, target);
		return index;
	}
}
