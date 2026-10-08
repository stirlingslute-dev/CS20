/*

Program: Change.java          Last Date of this Revision: September 30, 2019

Purpose: Create a PackageCheck application that prompts the user for the weight of
a package and its dimensions (length, width, and height), and then displays an appropriate message
if the package does not meet the requirements.
Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 
 

*/
package Mastery;

import java.util.Scanner;

public class Mastery2 {

	public static void main(String[] args) 
	{Scanner input = new Scanner(System.in);
	
	//ask user for package weight in kg
	System.out.print("enetr package weight in kg:");
	double weight = input.nextDouble();
	
	//ask user for length in cm
	System.out.print("enter package length in cm:");
	double length = input.nextDouble();	
	
	//ask user for width in cm
	System.out.print("enter package width in cm:");
	double width = input.nextDouble();
	
	//ask user for height in cm
	System.out.print("enter package height in cm:");
	double height = input.nextDouble();
	
	//calculate the volume of package
	double volume = length * width * height;
	
	//check if package is both too heavy or large
	if (weight > 27 && volume > 100000) {
		System.out.println("Too heavy and too large.");
	}
	
	//Check if package is just too heavy
	else if (weight > 27) {
		System.out.println("Too heavy.");
	}
	
	//Checks if package is just too large
	else if (volume > 100000) {
		System.out.println("Too large. ");
		}
	}
}
/*Screen dump
 enter package weight in kg:50
enter package length in cm:20
enter package width in cm:40
enter package height in cm:15
Too heavy.

enter package weight in kg:10
enter package length in cm:15
enter package width in cm:10
enter package height in cm:5

enter package weight in kg:100
enter package length in cm:50
enter package width in cm:50
enter package height in cm:50
Too heavy and too large.


 
 */

