package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{Scanner input = new Scanner(System.in);



    System.out.print("Enter an integer: ");

    int num = input.nextInt();



    if (num < 0) {

        System.out.println(num + " is not a perfect square.");

    } else {

        double root = Math.sqrt(num);

        int truncatedRoot = (int) root;

        int square = truncatedRoot * truncatedRoot;



        if (square == num) {

            System.out.println(num + " is a perfect square.");

        } else {

            System.out.println(num + " is not a perfect square.");

        }

    }
		

	}

}
