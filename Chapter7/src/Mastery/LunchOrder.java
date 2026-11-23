/*
 Program: LunchOrder.java          Last Date of this Revision: September 30, 2019

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french
fries, and sodas and then displays the total for the order. The LunchOrder application should include
a Food object with a constructor that accepts the price, fat, carbs, and fiber for an item. Food methods
should return the price of the item and return the fat, carbohydrates, and fiber.

Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 
 */
package Mastery;

import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		FoodItem hamburger = new FoodItem(1.85,9,33,1);
		
		FoodItem salad = new FoodItem(2.00,1,11,5);
		
		FoodItem fries = new FoodItem(1.30,11,36,4);
		
		FoodItem soda = new FoodItem(0.95, 0, 38, 0);
		
		System.out.print("Enter number of hamburgers");
		
		int numHamburgers = input.nextInt();
		
		System.out.println("Each hamburger has " + 
		hamburger.getFat()
				+ ".0g of fat," +
		hamburger.getCarbs()
				+ ".0g of carbs, and" +
		hamburger.getFiber()
				+".0g of fiber.");
		
		System.out.print("Enter number of salads:");
		
		int numSalads = input.nextInt();
		
		System.out.println("Each salad has" +
		salad.getFat()
		+ ".0g of fat, " + salad.getCarbs()
		+ ".0g of carbs, and" +
		salad.getFiber()
		+ ".0g of fiber.");
		
		System.out.print("Enter number of fries:");
		
		int numFries = input.nextInt();
		
		System.out.println("Each Fries has" +
		fries.getFat()
		+ ".0g of fat, " + fries.getCarbs()
		+ ".0g of carbs, and" +
		fries.getFiber()
		+ ".0g of fiber.");
		
		System.out.print("Enter number of sodas:");
		
		int numSodas = input.nextInt();
		
		System.out.println("Each soda has" + 
		soda.getFat()
		+ ".0g of fat, " + soda.getCarbs()
		+ ".0g of carbs, and" +
		soda.getFiber()
		+ ",0g of fiber.");
		
		double total = (numHamburgers *
hamburger.getPrice())
				+ (numSalads * salad.getPrice())
				+ (numFries * fries.getPrice())
				+ (numSodas * soda.getPrice());
		
		System.out.printf("Your order comes to: $ %.2f\n", total);
		
		input.close();
	}

}
/*Screen dump
Enter number of hamburgers5
Each hamburger has 9.0g of fat,33.0g of carbs, and1.0g of fiber.
Enter number of salads:2
Each salad has1.0g of fat, 11.0g of carbs, and5.0g of fiber.
Enter number of fries:1
Each Fries has11.0g of fat, 36.0g of carbs, and4.0g of fiber.
Enter number of sodas:3
Each soda has0.0g of fat, 38.0g of carbs, and0,0g of fiber.
Your order comes to: $ 17.40

Enter number of hamburgers2
Each hamburger has 9.0g of fat,33.0g of carbs, and1.0g of fiber.
Enter number of salads:1
Each salad has1.0g of fat, 11.0g of carbs, and5.0g of fiber.
Enter number of fries:2
Each Fries has11.0g of fat, 36.0g of carbs, and4.0g of fiber.
Enter number of sodas:2
Each soda has0.0g of fat, 38.0g of carbs, and0,0g of fiber.
Your order comes to: $ 10.20

Enter number of hamburgers3
Each hamburger has 9.0g of fat,33.0g of carbs, and1.0g of fiber.
Enter number of salads:4
Each salad has1.0g of fat, 11.0g of carbs, and5.0g of fiber.
Enter number of fries:4
Each Fries has11.0g of fat, 36.0g of carbs, and4.0g of fiber.
Enter number of sodas:4
Each soda has0.0g of fat, 38.0g of carbs, and0,0g of fiber.
Your order comes to: $ 22.55

*/