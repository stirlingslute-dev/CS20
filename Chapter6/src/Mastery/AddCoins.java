/*
 Program: Investment.java          Last Date of this Revision: September 30, 2019

Purpose: Create an AddCoins application that prompts the user for the number of pennies, nickels, dimes,
and quarters, and then displays their total dollar amount. The AddCoins application should include
a getDollarAmount() method that has four int parameters corresponding to the number of pennies,
nickels, dimes, and quarters, and returns a String that corresponds to the dollar value of the coins. 

Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 

 */

package Mastery;

import java.util.Scanner;

public class AddCoins {
	
	//find dollar amount
	public static String getDollarAmount(int pennies, int nickels,
            							int dimes, int quarters) {
		int totalCents = pennies + (nickels * 5)
				+ (dimes * 10) + (quarters * 25);
		
		return String.format("$%.2f", totalCents / 100.0);
	}
	
	//main Method
	public static void main(String[] args) 
	{ Scanner input = new Scanner(System.in);

    //Enter amount of coins
	System.out.print("Enter amount of pennies: ");
    int pennies = input.nextInt();

    System.out.print("Enter amount of nickels: ");
    int nickels = input.nextInt();

    System.out.print("Enter amount of dimes: ");
    int dimes = input.nextInt();

    System.out.print("Enter amount of quarters: ");
    int quarters = input.nextInt();

    //Find dollar amount
    String total = getDollarAmount(
            pennies, nickels, dimes, quarters);

    //show user how many dollars they have
    System.out.println("Total amount: " + total);

    input.close();
		

	}

}
/*Screen dump
 
 Enter amount of pennies: 2
Enter amount of nickels: 6
Enter amount of dimes: 3
Enter amount of quarters: 4
Total amount: $1.62

Enter amount of pennies: 7
Enter amount of nickels: 2
Enter amount of dimes: 3
Enter amount of quarters: 3
Total amount: $1.22

Enter amount of pennies: 8
Enter amount of nickels: 0
Enter amount of dimes: 1
Enter amount of quarters: 4
Total amount: $1.18

 */
