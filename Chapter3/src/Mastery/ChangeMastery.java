/*

Program: Change.java          Last Date of this Revision: September 30, 2019

Purpose: Create a Change application that prompts the user for an amount less than $1.00 and then 
displays the minimum number of coins necessary to make the change

Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 
 

*/

package Mastery;

import java.util.Scanner;

public class ChangeMastery {

	public static void main(String[] args) 
	{ Scanner input = new Scanner (System.in);
	
	int cents, quarters, dimes, nickels, pennies;
	
    // Ask the user to enter the amount of change
    System.out.print("Enter change amount: $");
    
    double amount = input.nextDouble();

    // Change dollars to cents
    cents = (int)(amount * 100);

    // Find the amount of quarters
    quarters = cents / 25;
    cents = cents % 25;

    // Find the amount of dimes
    dimes = cents / 10;
    cents = cents % 10;

    // Find the amount of nickels
    nickels = cents / 5;
    cents = cents % 5;

    // Make the remaining amount of cents into pennies
    pennies = cents;

    // Show the results
    System.out.println();
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);

    input.close();
}

		

	}
/*Screen Dump
  
  Enter change amount: $2.74

Quarters: 10
Dimes: 2
Nickels: 0
Pennies: 4

Enter change amount: $0.29

Quarters: 1
Dimes: 0
Nickels: 0
Pennies: 3

Enter change amount: $1.97

Quarters: 7
Dimes: 2
Nickels: 0
Pennies: 2
 */


		
