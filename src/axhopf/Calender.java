package axhopf;

public class Calender extends Resource{
	
	public Calender()
	{
		this.setName("");
		this.setDescription("");
		this.setYear(0);
		this.setInfo("");
	}
	
	public Calender(String name, String desc, int year, String info)
	{
		this.setName(name);
		this.setDescription(desc);
		this.setYear(year);
		this.setInfo(info);
	}
	
	
	public void showEvents(int month)
	{
		switch(month) {
		case 1: 
		System.out.println(new Calender("Barrack Obama", "Barack Obama was Inaugurated as the first Official Black U.S. President\n", 2009, "https://newpittsburghcourier.com/2025/01/01/this-week-in-black-history-january-1-7-2025/\n"));
		break;
		case 2:
		System.out.println(new Calender("The Second Great Migration", "\"A second African American exodus from the South spanned from 1950-1970 and included migration to Western cities. \"The Second Great Migration\" brought a dynamic demographic shift in cities like Los Angeles, Phoenix, and Seattle.\"", 1950, "Journey of Black History Month. (n.d.). National Museum of African American History and Culture. https://nmaahc.si.edu/explore/moments/black-history-month\n"));
		break;
		case 3:
		System.out.println(new Calender("Mamie Tape", "\"In the case Tape v. Hurley, California's Supreme Court rules that the state entitles \"all children\" access to public education. The case centers on Mamie Tape, then 8, an American-born daughter of Chinese immigrants whose family sued the San Francisco Board of Education for denying her admission because of her race.\"", 1889, "HISTORY.com Editors. (2025, May 28). Asian American Timeline - Immigration, achievements & famous firsts | HISTORY. HISTORY. https://www.history.com/articles/asian-american-timeline\n"));
		break;
		case 4:
		System.out.println(new Calender("Fidel Castro", "\"Fidel Castro announces that Cuban citizens may immigrate to Florida from the port of Mariel with their own arranged boat transport. In the months that follow, 125,000 Cubans flee the country, in what came to be called the Mariel Boatlift.\"", 1980, "HISTORY.com Editors. (2025b, June 30). Hispanic History Milestones: Timeline | HISTORY. HISTORY. https://www.history.com/articles/hispanic-latinx-milestones\n"));
		break;
		case 5:
		System.out.println(new Calender("Manjiro Nakahama", "\"A 14-year-old fisherman named Manjiro becomes the first official U.S. Japanese immigrant after being adopted by American Capt. William Whitfield who rescued the boy and his crew after a shipwreck 300 miles from Japan's coast. Years later, Manjiro returned to his home country, where he was named a samurai and worked as a political emissary with the West.\"", 1843, "HISTORY.com Editors. (2025, May 28). Asian American Timeline - Immigration, achievements & famous firsts | HISTORY. HISTORY. https://www.history.com/articles/asian-american-timeline\"\n"));
		break;
		case 6:
		System.out.println(new Calender("New York Chinatown Strikes", "\"More than 20,000 garment workers, most of whom are female immigrants from China and Hong Kong, rally in New York’s Chinatown after labor union negotiations stall. A second rally is held the next month, with a one-day strike taking place July 15, the largest in the history of Chinatown that ends with employers accepting the union’s contract demands.\"", 1982, "HISTORY.com Editors. (2025a, May 28). Asian American Timeline - Immigration, achievements & famous firsts | HISTORY. HISTORY. https://www.history.com/articles/asian-american-timeline\n"));
		break;
		case 7:
		System.out.println(new Calender("Mildred and Richard", "\"Mildred and Richard Loving were one of the first interracial couples legally married in the United States and their union marked a pivotal moment in marriage rights for mixed-race families.\"", 1958, "HISTORY.com Editors. (2025b, June 30). Hispanic History Milestones: Timeline | HISTORY. HISTORY. https://www.history.com/articles/hispanic-latinx-milestones\n"));
		break;
		case 8:
		System.out.println(new Calender("Sonia Sotomayor", "\"Sonia Sotomayor is sworn in by Chief Justice John Roberts as the first Hispanic Supreme Court justice and the third woman to serve on the court.\"", 2009, "HISTORY.com Editors. (2025b, June 30). Hispanic History Milestones: Timeline | HISTORY. HISTORY. https://www.history.com/articles/hispanic-latinx-milestones\n"));
		break;
		case 9:
		System.out.println(new Calender("Grape Strike", "\"Facing the threat of pay cuts and demanding improved working conditions, the Agricultural Workers Organizing Committee, made up mostly of Filipino farmworkers, begins the five-year-long Delano Grape strike in California that prompts a global grape boycott.\"", 1965, "HISTORY.com Editors. (2025a, May 28). Asian American Timeline - Immigration, achievements & famous firsts | HISTORY. HISTORY. https://www.history.com/articles/asian-american-timeline"));
		break;
		case 10:
		System.out.println(new Calender("Immigration and Nationality Act", "\"The act gives priority to highly skilled immigrants and those with family already living in America. Post Hart-Celler, nearly 500,000 people immigrate annually, with 80 percent coming from countries other than Europe.\"", 1965, "HISTORY.com Editors. (2025b, June 30). Hispanic History Milestones: Timeline | HISTORY. HISTORY. https://www.history.com/articles/hispanic-latinx-milestones\n"));
		break;
		case 11:
		System.out.println(new Calender("Ronald Reagan", "\"President Ronald Reagan signs the Immigration Reform and Control Act into law, granting 2.7 million long-term immigrants permanent legal status, but also imposing restrictions, increasing border security and making it illegal for employers to knowingly hire unauthorized workers.\"", 1986, "HISTORY.com Editors. (2026, January 13). Black History Milestones: Timeline | HISTORY. HISTORY. https://www.history.com/articles/black-history-milestones#Loving-v.-Virginia-Ruling-1958\n"));
		break;
		case 12:
		System.out.println(new Calender("World War II", "\"Japan attacks Pearl Harbor, drawing the U.S. into World War II. More than 500,000 Mexican Americans serve in the American military during the conflict, with 13 Medals of Honor awarded to Latinos. The 158th Regimental Combat Team, largely composed of Latino and Native American soldiers who fought in the Philippines and New Guinea, is called “the greatest fighting combat team ever deployed in battle” by Gen. Douglas MacArthur.\"", 1941, "HISTORY.com Editors. (2025b, June 30). Hispanic History Milestones: Timeline | HISTORY. HISTORY. https://www.history.com/articles/hispanic-latinx-milestones\n"));
		break;
		default:
		System.out.println("Invalid Month");
		break;
		}
	}
	
	@Override
	public String toString() {
	 
	    return String.format("%s %d: %s\n%s", this.name, this.year, this.description, this.info);
	}

}
