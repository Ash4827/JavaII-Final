package axhopf;

import java.util.ArrayList;

public class Information {
	
	private String link;
	private String description;
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Information() //default constructor
	{
		setLink("");
	}
	
	public Information(String link, String description)
	{
		setLink(link);
		setDescription(description);
	}
	
	public void print(ArrayList<Information> info)
	{
		for(Information item : info)
		{
			System.out.println(item);
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s, %s", this.getLink(), this.getDescription());
	}

	
	

}
