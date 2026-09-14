package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		//Declare Variables
		int length;
		int width;
		int area;
		int perimeter;
		
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
		
		//calculate the area
		area = length * width;
		
		//display the area on screen
		System.out.println("Area = "+ area);
		
		//calculate the perimeter
		perimeter = (2 * length + 2 * width);
		
		//display the perimeter on the screen
		System.out.println("perimeter = "+ perimeter);
		
		//stirling
	}


}
