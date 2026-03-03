package axhopf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static ArrayList<Information> conversion(List<String> data)
	{
		ArrayList<Information> list = new ArrayList<>();
		for(String item : data)
		{
			list.add(new Information(item));
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ArticlesInfo = List.of("Mental Health America\nhttps://mhanational.org/bipoc-mental-health/", "NAMI Seattle Mental Health Resources\nhttps://namiseattle.org/support-resources/bipoc-mental-health-resources/");
		List<String> SafeSpaces = List.of("Black Emotional and Mental Health Collective\nhttps://wellness.beam.community/", "BIPOC Adoptees Support\nhttps://bipocadoptees.space/forms/submit-resource");
		List<String> Providers = List.of("University of Washington BIPOC Resources\nhttps://geography.washington.edu/community-sourced-resources-bipoc-mental-health");
		ArrayList<Information> ArticleInfo = conversion(ArticlesInfo);
		ArrayList<Information> SafeSpaceList = conversion(SafeSpaces);
		ArrayList<Information> ProviderList = conversion(Providers);
		
		Information object = new Information();
		Scanner scnr = new Scanner(System.in);
		String input = "";
		String resourceInput = "";
		String firstName; //user info
		String lastName;
		int age;
		
		System.out.println("Enter Your First Name:");
		firstName = scnr.next();
		System.out.println("Enter Your Last Name:"); //prompt for user info
		lastName = scnr.next();
		System.out.println("Enter Your Age:");
		age = scnr.nextInt();
		
		User user = new User(firstName, lastName, age); //user object
		
		
		while(!input.equals("-1")) { //TODO: wont let you go back into the switch statement after leaving!!!
		System.out.println("Welcome, " + firstName + " " + lastName + ", what would you like to do?");
		System.out.println("1: Access BIPOC Mental Health Resources\n\n-1 To Exit");				
		
		input = scnr.next();
		
		switch(input)
		{
		case "1":
		while(!resourceInput.equals("-1"))
		{
			System.out.println("Select Resource:\n1.Articles and Information\n2. Safe Space Forums\n3.Find a Provider\n\nType -1 To Go Back");
			resourceInput = scnr.next();
			if(resourceInput.equals("1"))
			object.print(ArticleInfo);
			
			if(resourceInput.equals("2"))
			object.print(SafeSpaceList);
			
			if(resourceInput.equals("3"))
			object.print(ProviderList);
		}
		
			
		break;
		case "2":
			
		//something here 
			
		break;
		case "3":
		
		//something here
			
		break;
		//etc
		}				//main menu as a switch statement ^
		
		}//end while
	}

}
