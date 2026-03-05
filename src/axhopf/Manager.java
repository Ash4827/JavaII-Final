package axhopf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager {
	
	private ArrayList<HistoricalFigure> figures = new ArrayList<>();
    private ArrayList<SupportGroup> supportList = new ArrayList<>();
    private ArrayList<Resource> articleInfo = new ArrayList<>();
    private ArrayList<Resource> safeSpaceList = new ArrayList<>();
    private ArrayList<Resource> providerList = new ArrayList<>();
    
    
    public ArrayList<Resource> getArticleInfo() { return this.articleInfo; }
    public ArrayList<Resource> getSafeSpaceList() { return this.safeSpaceList; }
    public ArrayList<Resource> getProviderList() { return this.providerList; }
	
	public ArrayList<SupportGroup> getSupportList() {
		return this.supportList;
	}

	public ArrayList<HistoricalFigure> getFiguresArray()
	{
		return this.figures;
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
	
	public void addSupport(SupportGroup group) //adds a group to the supportList array
	{
		supportList.add(group);
	}
	
	

	public void print(ArrayList<Resource> info) //print function for resource arrays
	{
		for(Resource item : info)
		{
			System.out.println(item);
		}
	}
	
	public void printFigures()
	{
		for(HistoricalFigure figure : figures)
		{
			System.out.println(figure.getName());
		}
	}
	
	public void printSupport()
	{
		for(SupportGroup group : supportList)
		{
			System.out.println(group);
		}
	}
	
	public <T extends Resource> int searchArray(ArrayList<T> arrayList, T target) //Generic method for searching array lists
	{
		Collections.sort(arrayList);
		int index = Collections.binarySearch(arrayList, target);
		return index;
	}
	
	public void loadData() {
	   
	    SupportGroup healingCircle = new SupportGroup("The Healing Circle", "A non-clinical peer space for BIPOC voices to share stories, process identity, and build community through collective healing.", new ArrayList<User>());
	    healingCircle.addMember(new User("Martin Gray", 23));
	    healingCircle.addMember(new User("Peyton Manning", 54));
	    healingCircle.addMember(new User("Lora Plankton", 32));
	    this.addSupport(healingCircle);
	    
	    SupportGroup generationalEchoes = new SupportGroup("Generational Echoes", "A trauma-informed circle exploring ancestral history, breaking cycles, and celebrating cultural resilience in modern life.", new ArrayList<User>());
	    this.addSupport(generationalEchoes);
	    
	    List<String> articlesInfo = List.of("Mental Health America\nhttps://mhanational.org/bipoc-mental-health/", "NAMI Seattle Mental Health Resources\nhttps://namiseattle.org/support-resources/bipoc-mental-health-resources/");
	    this.articleInfo = this.conversion(articlesInfo); 

	    List<String> safeSpaces = List.of("Black Emotional and Mental Health Collective\nhttps://wellness.beam.community/", "BIPOC Adoptees Support\nhttps://bipocadoptees.space/forms/submit-resource");
	    this.safeSpaceList = this.conversion(safeSpaces);

	    List<String> providers = List.of("University of Washington BIPOC Resources\nhttps://geography.washington.edu/community-sourced-resources-bipoc-mental-health");
	    this.providerList = this.conversion(providers);
	    
	    HistoricalFigure Coachman = new HistoricalFigure("Alice Coachman", "Gold Medalist", 1948, "Was denied multiple times to compete in the olympics; Even so, she ran barefoot on dirt roads and used sticks to practice her high jump, eventually catching the attention of Tuskegee Institute and broke records.", "Bonn, T. (2026, February 1). 8 Black pioneers who were somehow overlooked in the history books. Katie Couric Media. https://katiecouric.com/entertainment/little-known-black-historical-figures/");
		HistoricalFigure Daly = new HistoricalFigure("Marie Daly", "Biochemist", 1947, "She was the first African American woman to earn a PhD in the United States!", "Celebrating Black History Month - Marie Maynard Daly | Molecular Biophysics and Biochemistry. (n.d.). https://mbb.yale.edu/news/celebrating-black-history-month-marie-maynard-daly");
		
		figures.add(Daly);
		figures.add(Coachman);
	}
	
	public void addUserToGroupName(String targetName, User newUser) {
	    for (SupportGroup group : supportList) {
	     if (group.getName().equalsIgnoreCase(targetName)) {
	            group.addMember(newUser);
	            System.out.println("You've Been Added!");
	            return;
	        }
	    }
	    System.out.println("Group not found!");
	}

	
}
