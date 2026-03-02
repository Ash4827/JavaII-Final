package axhopf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mentalHealthList = List.of("https://mhanational.org/bipoc-mental-health/", "https://namiseattle.org/support-resources/bipoc-mental-health-resources/", "https://geography.washington.edu/community-sourced-resources-bipoc-mental-health", "https://wellness.beam.community/", "https://bipocadoptees.space/forms/submit-resource");
		List<String> mentalHealthDescriptions = List.of("Mental Health America", "NAMI Seattle Mental Health Resources", "University of Washington BIPOC Resources", "Black Emotional and Mental Health Collective", "BIPOC Adoptees Support");
		
		ArrayList<Information> mentalHealthTotal = new ArrayList<Information>();
		
		for(int i = 0; i < mentalHealthList.size() && i < mentalHealthDescriptions.size(); i++)
		{
			Information info = new Information(mentalHealthList.get(i), mentalHealthDescriptions.get(i)); //creates information objects of mental health resources
			mentalHealthTotal.add(info);
		}
			
		Information object = new Information();
		Scanner scnr = new Scanner(System.in);
		String input = "";
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
		
		System.out.println("Welcome, " + firstName + " " + lastName + ", what would you like to do?");
		System.out.println("1: Access BIPOC Mental Health Resources");
		
		input = scnr.next();
		
		switch(input)
		{
		case "1":
		
		object.print(mentalHealthTotal);
			
		break;
		case "2":
			
		//something here 
			
		break;
		case "3":
		
		//something here
			
		break;
		//etc
		}				//main menu as a switch statement ^
		
	
	}

}
