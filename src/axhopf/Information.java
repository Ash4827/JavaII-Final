package axhopf;

import java.util.ArrayList;

public class Information {
	
	
	private String info;
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
	public Information() //default constructor
	{
		setInfo("");
	}
	
	public Information(String info)
	{
		setInfo(info);
	}
	
	public void print(ArrayList<Information> info) //print function
	{
		for(Information item : info)
		{
			System.out.println(item);
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s\n", this.getInfo()); //toString formatted
	}

	
	
	

}
