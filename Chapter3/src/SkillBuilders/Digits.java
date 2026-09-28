package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) 
	{
		//Declare variables
		int number, onePlace, tensPlace;
		
		//Create a scanner object
		Scanner userinput = new Scanner(System.in);
		
		// Ask the user to enter two diget number
		System.out.println("Enter two digit number");
		
		//Record what the user entered
		number = userinput.nextInt();
		
		//One places
		onePlace = number % 10;
		
		//Tens place
		tensPlace = number / 10;
		
		//Display the ones and tens place digits
		System.out.println("The tens-didgets is "
							+ tensPlace
							+ " And the one-digit is "
							+ onePlace);
		
		
		
	}
	
	
	
	
	
	
}
