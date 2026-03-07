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
		System.out.println("1: Access BIPOC Mental Health Resources\n2: Calculate Diversity in Any Group\n3: View Historical Figures\n4. Join a Support Group\n5. View Event Calender\n\n-1 To Exit\n");				
		
		
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
		boolean passed = false;
		while(!passed) {
		System.out.println("Enter the number of Black people:");
		try {
		numBlack = scnr.nextInt();
		
		if(numBlack < 0)
		throw new IllegalArgumentException();
		
		System.out.println("Enter the number of Asian people:");
		numAsian = scnr.nextInt();
		
		if(numAsian < 0)
		throw new IllegalArgumentException();
		
		System.out.println("Enter the number of Hispanic people:");
		numHispanic = scnr.nextInt();
		
		if(numHispanic < 0)
		throw new IllegalArgumentException();
		System.out.println("Enter the number of White people:");
		numWhite = scnr.nextInt();
		
		if(numWhite < 0)
		throw new IllegalArgumentException();
		
		double index = calcIndex.CalculateDiversityIndex(numBlack, numAsian, numHispanic, numWhite);
		passed = true;
		System.out.printf("There is a %.2f%% chance 2 people will be different races if picked at random!", index);
		System.out.println();}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid Number, try again\n");
			}
		}
		break;
		case "3":
		scnr.nextLine();
		resourceInput = "";
		while(resourceInput != "-1") {
		System.out.println("\nEnter a name to learn more about a specific figure (or type -1)\n");
		manager.printFigures();
		
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
		resourceInput = "";
		
		while(!resourceInput.equals("-1")) {
		
		System.out.println("Enter the month (as an integer) that you want to view an event of (or -1 to go back):\n");
		
		boolean isValid = false;
		while(!isValid) {
		try {
		int monthInput = scnr.nextInt();
		if(monthInput == -1)
		{
			resourceInput = "-1";
			isValid = true;
		}
		else if(monthInput < 1 || monthInput > 12)
		{
			throw new IllegalArgumentException();
		}
		else calender.showEvents(monthInput);
		isValid = true;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input, try again");
			scnr.nextLine();
				}
		catch(IllegalArgumentException e)
		{
			System.out.println("Number out of range, try again.");
			
				}
			}
		}
		break;
		default:
		System.out.println("Error: Select a valid option\n");
		break;
		//etc
				}				//main menu as a switch statement ^
			 // end try
		
		
		
		}//end while
		
		scnr.close();
	}

}
