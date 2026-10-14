/*

Program: DidgeSum.java          Last Date of this Revision: September 30, 2019

Purpose: Create a DigitsSum application that prompts the user for a non-negative integer and then displays the
sum of the digits

Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 
 

*/
package Mastery;

import java.util.Scanner;

public class Mastery2 {

	public static void main(String[] args) 
	{Scanner input = new Scanner(System.in);

    // Ask the user to enter a non-negative integer
    System.out.print("Enter a non-negative integer: ");
    int number = input.nextInt();

    // Set the sum to 0
    int sum = 0;

    // Add each digit to the sum
    while (number > 0) {
        sum += number % 10;
        number /= 10;
    }

    // Display the sum of the digits
    System.out.println("The sum of the digits is: " + sum);

    input.close();
}	
	}
/* Screen Dump
 
 Enter a non-negative integer: 612
The sum of the digits is: 9

Enter a non-negative integer: 75
The sum of the digits is: 12

Enter a non-negative integer: 12
The sum of the digits is: 3

 */

