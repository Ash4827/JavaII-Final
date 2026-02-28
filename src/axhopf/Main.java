package axhopf;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String input = "";
		String firstName;
		String lastName;
		int age;
		
		System.out.println("Enter Your First Name:");
		firstName = scnr.next();
		System.out.println("Enter Your Last Name:");
		lastName = scnr.next();
		System.out.println("Enter Your Age:");
		age = scnr.nextInt();
		
		User user = new User(firstName, lastName, age); //user object
		
		System.out.println("Welcome, " + firstName + " " + lastName + ", what would you like to do?");
		
		input = scnr.next();
		
		switch(input)
		{
		case "1":
		
		//something here
			
		break;
		case "2":
			
		//something here
			
		break;
		case "3":
		
		//something here
			
		break;
		//etc
		}
		
	
	}

}
