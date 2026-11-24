package Mastery;

import java.util.Scanner;

class PiggyBank {
	private int totalCents = 0;
	
	public void addPenny( ) {
		totalCents += 1;
	}

	public void addNickel() {
		totalCents += 5;
	}

	public void addDime() {
		totalCents +=10; 
	}
	
	public void addQuarter() {
		totalCents +=25;
	}
	
	public void takeMoneyOut(int amount) {
		if (amount <= totalCents) {
			totalCents -= amount;
			System.out.println("Money taken out. ");
		} else {
			System.out.println("Not enough money in the bank. ");
		}
	}
	
	public double getTotal( ) {
		return totalCents / 100.0;
	}
}

public class MySavings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		PiggyBank bank = new PiggyBank();
		
		int choice = -1;
		
		while (choice != 0);
		
		System.out.println("1. Show total in bank.");
		
		System.out.println("2. Add a penny.");
		System.out.println("3. Add a nickle.");
		System.out.println("4. Add a dime.");
		System.out.println("5. Add a quater.");
		System.out.println("6.Take money out of bank. ");
		
		System.out.println("Enter 0 to quit");
		
		System.out.println("Enter your choice: ");
		choice = input.nextInt();
		
		switch (choice) {
		
		case 1:
			System.out.printf("Total in bank: ", bank.getTotal());
			break;
			
		case 2:
			bank.addPenny();
			System.out.println("penny added.");
			break;
			
		case 3:
			bank.addNickel();
			System.out.println("nickel added.");
			break;
			
		case 4:
			bank.addDime();
			System.out.println("dime added.");
			break;
			
		case 5:
			bank.addQuarter();
			System.out.println("quarter added.");
			
		case 6:
			System.out.println("Enter amount to take out in cents: ");
			int amount = input.nextInt();
			bank.takeMoneyOut(amount);
			break;
			
		case 0:
			System.out.println("Goodbye!");
			break;
				
		default:
			System.out.println("Invaild choice. Try again.");	
		}
	}
}
