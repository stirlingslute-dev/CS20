package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) 
	{Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the length of package: ");
    double length = input.nextDouble();

    System.out.print("Enter the width of package: ");
    double width = input.nextDouble();

    System.out.print("Enter the height of package: ");
    double height = input.nextDouble();

    if (length > 10 || width > 10 || height > 10) {
        System.out.println("Reject");
        }else{
        System.out.println("Accept");
    }
		

	}

}
