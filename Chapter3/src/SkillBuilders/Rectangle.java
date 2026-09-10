package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		//Declare Variables
		int length;
		int width;
		
		//Create a scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the width
		System.out.print("Enter the width: ");
		
		
		//Get the width value from the user
		width = userinput.nextInt();
		
		//Ask the user to enter length
		System.out.print("Enter the length: ");
		
		//Get the length value from the user
		length = userinput.nextInt();
	
		
		//Display the width and length on the console
		System.out.println("The length is: " + length);
		System.out.print("The width is: " + width);
	
	//stirling
	}


}
