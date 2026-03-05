package axhopf;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager();
		manager.loadData();
		
		DiversityCalculator calcIndex = new DiversityCalculator();
		Calender calender = new Calender();
		
		Scanner scnr = new Scanner(System.in);
		String input = "";
		String resourceInput;
		String name;
		int age = -1;
		int numBlack;
		int numAsian;
		int numHispanic;
		int numWhite;
		boolean valid = false;
		
		System.out.println("Enter Your Full Name:");
		name = scnr.next();
		
		while(!valid) {
		System.out.println("Enter Your Age:");
		try {
		age = scnr.nextInt();
		if(age >= 0)
		valid = true;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error: Enter a valid age");
			scnr.next();
		}
		}
		
		
		User user = new User(name, age);
		
		while(!input.equals("-1")) { 
		System.out.println("Welcome, " + name + ", what would you like to do?");
		System.out.println("1: Access BIPOC Mental Health Resources\n2: Calculate Diversity in Any Group\n3: View Historical Figures\n4. Join a Support Group\n\n-1 To Exit\n");				
		
		
		input = scnr.next();
		resourceInput = "";
		switch(input)
		{
		case "1":
		while(!resourceInput.equals("-1"))
		{
			System.out.println("Select Resource:\n1.Articles and Information\n2. Safe Space Forums\n3.Find a Provider\n\nType -1 To Go Back");
			resourceInput = scnr.next();
			if(resourceInput.equals("1")) {
			ArrayList<Resource> articles = manager.getArticleInfo();
		    manager.print(articles);
			}
			if(resourceInput.equals("2")) {
			ArrayList<Resource> SafeSpaces = manager.getSafeSpaceList();
			manager.print(SafeSpaces);
			}
			if(resourceInput.equals("3")) {
			ArrayList<Resource> Providers = manager.getProviderList();
			manager.print(Providers);
			}
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
		while(resourceInput != "-1") {
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
			int num = manager.searchArray(manager.getFiguresArray(), target);
			if(num >= 0)
			System.out.println("Found!\n" + manager.getFiguresArray().get(num));
			else
			System.out.println("Figure not found :[");
				}
			}
		}
		break;
		case "4":
		resourceInput = "";
		manager.printSupport();
		while(!resourceInput.equals("-1")) {
		System.out.println("Type The Name of The Group You'd Like To Join (or Type -1):\n");
		scnr.nextLine();
		resourceInput = scnr.nextLine();
		manager.addUserToGroupName(resourceInput, user);
		resourceInput = "-1";
		}	
		break;
		case "5":
		System.out.println("Enter the month (as an integer) that you want to view the events of:\n");
		calender.showEvents(scnr.nextInt());
		break;
		default:
		break;
		//etc
				}				//main menu as a switch statement ^
			 // end try?
		
		
		
		}//end while
		
		scnr.close();
	}

}
