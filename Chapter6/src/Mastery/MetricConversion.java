/*
 Program: Investment.java          Last Date of this Revision: September 30, 2019

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts
the user to choose a conversion. Conversion choices should include inches to centimeters, feet to centimeters, yards to meters, miles to kilometers, and vice versa. The application should include separate
methods for doing each of the conversions.
Author: Your Name, Stirling
School: CHHS
Course: Computer Science 20 

 */

package Mastery;

import java.util.Scanner;

public class MetricConversion {
	
	// Inches to Centimeters
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Centimeters to Inches
    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    // Feet to Centimeters
    public static double feetToCentimeters(double feet) {
        return feet * 30.48;
    }

    // Centimeters to Feet
    public static double centimetersToFeet(double centimeters) {
        return centimeters / 30.48;
    }

    // Yards to Meters
    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }

    // Meters to Yards
    public static double metersToYards(double meters) {
        return meters / 0.9144;
    }

    // Miles to Kilometers
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // Kilometers to Miles
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
	
    
    //Main Method
	public static void main(String[] args)
	{ 
		Scanner input = new Scanner(System.in);

        int choice;
        double value;
        double result;

        //ask user what method they are using
        System.out.println("Conversion Menu");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Centimeters to Inches");
        System.out.println("3. Feet to Centimeters");
        System.out.println("4. Centimeters to Feet");
        System.out.println("5. Yards to Meters");
        System.out.println("6. Meters to Yards");
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Kilometers to Miles");
      
        //Print what method they choose
        System.out.print(" Choose a conversion 1-9: ");
        choice = input.nextInt();

        if (choice >= 1 && choice <= 8) {

            System.out.print("Enter what you want to convert: ");
            value = input.nextDouble();

            switch (choice) {

             case 1:
             result = inchesToCentimeters(value);
             System.out.println(value + " inches = "
                       + result + " centimeters");
             break;

             case 2:
             result = centimetersToInches(value);
             System.out.println(value + " centimeters = "
                       + result + " inches");
             break;

             case 3:
             result = feetToCentimeters(value);
             System.out.println(value + " feet = "
                       + result + " centimeters");
             break;

             case 4:
             result = centimetersToFeet(value);
             System.out.println(value + " centimeters = "
                       + result + " feet");
             break;

             case 5:
             result = yardsToMeters(value);
             System.out.println(value + " yards = "
                       + result + " meters");
             break;

             case 6:
             result = metersToYards(value);
             System.out.println(value + " meters = "
                       + result + " yards");
             break;

             case 7:
             result = milesToKilometers(value);
             System.out.println(value + " miles = "
                       + result + " kilometers");
             break;

             case 8:
             result = kilometersToMiles(value);
             System.out.println(value + " kilometers = "
            		 	+ result + " miles");
             break;
            }
        input.close();
        }

	}
}
/*Screen dump
 
 Conversion Menu
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
 Choose a conversion 1-9: 3
Enter what you want to convert: 5
5.0 feet = 152.4 centimeters

Conversion Menu
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
 Choose a conversion 1-9: 3
Enter what you want to convert: 13
13.0 feet = 396.24 centimeters

Conversion Menu
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
 Choose a conversion 1-9: 1
Enter what you want to convert: 9
9.0 inches = 22.86 centimeters
 */