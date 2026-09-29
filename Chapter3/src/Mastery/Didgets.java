/*

Program: Digits.java          Last Date of this Revision: September 30, 2019

Purpose: Modify the Digits application created in a review earlier in this chapter to show the 
hundreds-place three digit number.
digit of a three

Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 
 

*/

package Mastery;

import java.util.Scanner;

public class Didgets {

	public static void main(String[] args) 
	{Scanner input = new Scanner(System.in);
	
	int number, hundreds, tens, ones;
	
	//ask user to enter three digit number
	System.out.print("Enter three digit number: ");
	
	number = input.nextInt();
	
	//Find hundred digit
	hundreds = number / 100;
	
	//Find tens digit
	tens = (number % 100) / 10;
	
	//Find ones digit
	ones = number % 10;
	
	//Show the work
	System.out.println(" Hundreds place: " + hundreds);
	System.out.println(" Tenths place: " + tens);
	System.out.println(" Ones place: " + ones);
		

	}

}
/*Screen Dump

Enter three digit number: 365
 Hundreds place: 3
 Tenths place: 6
 Ones place: 5
 
 Enter three digit number: 591
 Hundreds place: 5
 Tenths place: 9
 Ones place: 1

Enter three digit number: 178
 Hundreds place: 1
 Tenths place: 7
 Ones place: 8
*/
