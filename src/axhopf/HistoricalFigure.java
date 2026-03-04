package axhopf;

public class HistoricalFigure extends Resource{
	
	String contribution;
	
	public String getContribution() {
		return contribution;
	}
	public void setContribution(String contribution) {
		this.contribution = contribution;
	}
	
	public HistoricalFigure()
	{
		super.setName("");
		super.setDescription("");
		super.setYear(-1);
		setContribution("");
		
	}
	
	public HistoricalFigure(String name, String desc, int year, String contribution, String source)
	{
		super.setName(name); super.setDescription(desc); super.setYear(year); super.setInfo(source); setContribution(contribution);
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %d: %s\n%s\n%s\n", this.getName(), this.getYear(), this.getDescription(), getContribution(), this.getInfo()); //toString formatted
	}
	
	

}
