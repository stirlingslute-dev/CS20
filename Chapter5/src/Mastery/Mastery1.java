/*

Program: Investment.java          Last Date of this Revision: September 30, 2019

Purpose: Create an Investment application that calculates how many years it will take for a $2,500 investment
to be worth at least $5,000 if compounded annually at 7.5%

Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 
 

*/
package Mastery;

public class Mastery1 {

	public static void main(String[] args) 
	{  
		int years;
		
		// Set the starting investment
        double investment = 2500.0;

        // Set the target amount
        double target = 5000.0;

        // Set the annual interest rate
        double rate = 0.075;

        // Count the number of years
         years = 0;

        // Calculate interest each year
        while (investment < target) {
            investment = investment * (1 + rate);
            years++;
        }

        // Display the results
        System.out.println("Years required: " + years);
        System.out.printf("Final investment value: $%.2f%n", investment);
    }
		

	}
/*Screen Dump
 Years required: 10
Final investment value: $5152.58
 
 */
