package axhopf;

/*Main parent class for any kinds of resources*/


public class Resource {
	
	private String name;
	private String description;
	private String info;
	private int year;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public Resource()
	{
		setName("");
		setDescription("");
		setYear(-1);
		setInfo("");
	}
	
	public Resource(String info)
	{
		this();
		setInfo(info);
	}
	
	public Resource(String name, String description, int year)
	{
		setName(name);
		setDescription(description);
		setYear(year);
		setInfo("");
	}
	
	@Override
	public String toString()
	{
		if(this.getInfo() != null) //toString formatted
		return this.getInfo();
		
		return String.format("%s %d: %s", this.name, this.year, this.description);
	}
	
	
	
}
