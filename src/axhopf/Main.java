package axhopf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager();
		
		List<String> ArticlesInfo = List.of("Mental Health America\nhttps://mhanational.org/bipoc-mental-health/", "NAMI Seattle Mental Health Resources\nhttps://namiseattle.org/support-resources/bipoc-mental-health-resources/");
		List<String> SafeSpaces = List.of("Black Emotional and Mental Health Collective\nhttps://wellness.beam.community/", "BIPOC Adoptees Support\nhttps://bipocadoptees.space/forms/submit-resource");
		List<String> Providers = List.of("University of Washington BIPOC Resources\nhttps://geography.washington.edu/community-sourced-resources-bipoc-mental-health");
		ArrayList<Resource> ArticleInfo = manager.conversion(ArticlesInfo);
		ArrayList<Resource> SafeSpaceList = manager.conversion(SafeSpaces);
		ArrayList<Resource> ProviderList = manager.conversion(Providers);
		
		HistoricalFigure Coachman = new HistoricalFigure("Alice Coachman", "Gold Medalist", 1948, "Was denied multiple times to compete in the olympics; Even so, she ran barefoot on dirt roads and used sticks to practice her high jump, eventually catching the attention of Tuskegee Institute and broke records.", "Bonn, T. (2026, February 1). 8 Black pioneers who were somehow overlooked in the history books. Katie Couric Media. https://katiecouric.com/entertainment/little-known-black-historical-figures/");
		HistoricalFigure Daly = new HistoricalFigure("Marie Daly", "Biochemist", 1947, "She was the first African American woman to earn a PhD in the United States!", "Celebrating Black History Month - Marie Maynard Daly | Molecular Biophysics and Biochemistry. (n.d.). https://mbb.yale.edu/news/celebrating-black-history-month-marie-maynard-daly");
		
		manager.addFigure(Coachman);
		manager.addFigure(Daly);
		
		DiversityCalculator calcIndex = new DiversityCalculator();
		
		Scanner scnr = new Scanner(System.in);
		String input = "";
		String resourceInput;
		String firstName; //user info
		String lastName;
		int age;
		int numBlack;
		int numAsian;
		int numHispanic;
		int numWhite;
		
		System.out.println("Enter Your First Name:");
		firstName = scnr.next();
		System.out.println("Enter Your Last Name:"); //prompt for user info
		lastName = scnr.next();
		System.out.println("Enter Your Age:");
		age = scnr.nextInt();
		
		
		
		
		while(!input.equals("-1")) { 
		System.out.println("Welcome, " + firstName + " " + lastName + ", what would you like to do?");
		System.out.println("1: Access BIPOC Mental Health Resources\n2: Calculate Diversity in Any Group\n3: View Historical Figures\n\n-1 To Exit\n");				
		
		input = scnr.next();
		resourceInput = "";
		switch(input)
		{
		case "1":
		while(!resourceInput.equals("-1"))
		{
			System.out.println("Select Resource:\n1.Articles and Information\n2. Safe Space Forums\n3.Find a Provider\n\nType -1 To Go Back");
			resourceInput = scnr.next();
			if(resourceInput.equals("1"))
			manager.print(ArticleInfo);
			
			if(resourceInput.equals("2"))
			manager.print(SafeSpaceList);
			
			if(resourceInput.equals("3"))
			manager.print(ProviderList);
		}
		
			
		break;
		case "2":
		System.out.println("Enter the number of Black people:");
		numBlack = scnr.nextInt();
		System.out.println("Enter the number of Asian people:");
		numAsian = scnr.nextInt();
		System.out.println("Enter the number of Hispanic people:");
		numHispanic = scnr.nextInt();
		System.out.println("Enter the number of White people:");
		numWhite = scnr.nextInt();
		double index = calcIndex.CalculateDiversityIndex(numBlack, numAsian, numHispanic, numWhite);
		System.out.printf("There is a %.2f%% chance 2 people will be different races if picked at random!", index);
		System.out.println();
			
		break;
		case "3":
		resourceInput = "";
		System.out.println("\nEnter a name to learn more about a specific figure (or type -1)\n");
		manager.printFigures(); 
		while(!resourceInput.equals("-1")) {
		
		scnr.nextLine();
		String search = scnr.nextLine();
		if(search.equals("-1"))
		{
			resourceInput = "-1";
		}
		else {
			HistoricalFigure target = new HistoricalFigure();
			target.setName(search);
			int num = manager.searchArray(manager.getArray(), target);
			if(num >= 0)
			System.out.println("Found!\n" + manager.getArray().get(num));
			else
			System.out.println("Figure not found :[");
		}
		
		
		}
		break;
		default:
		break;
		//etc
		}				//main menu as a switch statement ^
		
		}//end while
		
		scnr.close();
	}

}
