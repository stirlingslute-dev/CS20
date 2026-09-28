package SkillBuilders;

import java.util.Scanner;

public class GradeAvg1of2 {

	public static void main(String[] args) 
	{
		//Users grades
		int grade1, grade2, grade3, grade4, grade5;
	
		//create a scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask user to enter grades
		System.out.print("Eneter grade 1 ");
		grade1 = userinput.nextInt();
		
		System.out.print("Eneter grade 2 ");
		grade2 = userinput.nextInt();
		
		System.out.print("Eneter grade 3 ");
		grade3 = userinput.nextInt();
		
		System.out.print("Eneter grade 4 ");
		grade4 = userinput.nextInt();
		
		System.out.print("Eneter grade 5 ");
		grade5 = userinput.nextInt();
		
		//output users Avg grade
		double average = (grade1 + grade2 + grade3 + grade4 + grade5) /5.0;
		
		System.out.println("Average " + average);
		
	}

}
