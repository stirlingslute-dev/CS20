/*

Program: Change.java          Last Date of this Revision: September 30, 2019

Purpose: Create an Eggs application that prompts the user for the number of eggs.
Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 
 

*/

package Mastery;

import java.util.Scanner;

public class Mastery1 {

	public static void main(String[] args) 
	//A Scanner object so we can get input from the user
	{Scanner input = new Scanner(System.in);
	
	// Asks user to enter amount of eggs
    System.out.print("Enter the number of eggs: ");
    
 // the number of eggs entered by the user
    int eggs = input.nextInt();

 // Calculates the cost of the eggs24
    double bill = eggs * (0.50 / 12);

 // Shows the total cost with two decimal places
    System.out.printf("The bill is equal to: $%.2f%n", bill);
		

	}

}
/*Screen Dump
 Enter the number of eggs: 18
The bill is equal to: $0.75

Enter the number of eggs: 4
The bill is equal to: $0.17

Enter the number of eggs: 35
The bill is equal to: $1.46

*/