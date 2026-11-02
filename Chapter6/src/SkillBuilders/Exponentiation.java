package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) 
	{ Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first number: ");
	double num1 = input.nextDouble();
	
	System.out.print("Eneter second number: ");
	double num2 = input.nextDouble();
	
	double answer = powerOf(num1, num2);
	
	System.out.println(num1 + " raised to the power of " + num2 + " is " + answer);
	
	input.close();
	}
	
	public static double powerOf(double number, double power) {
		return Math.pow(number, power);
	}
}
