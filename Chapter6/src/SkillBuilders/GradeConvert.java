package SkillBuilders;

import java.util.Scanner;

public class GradeConvert 
{
	
	public static boolean isValidNumber(int userNUm, int minNum, int maxNum)
	{
		if(minNum <= userNUm && userNUm <= maxNum)
		{
			return(true);
		}
		else
		{
			return(false);
		}	
	
	}//closes isValid	
	
	
	public static String getLetterGrade(int numGrade)
	{
		if(numGrade < 60)
		{
		return("F");
		}
		
				
	else if (numGrade < 70)
	{
		if(numGrade == 69)
		{
			return("D+");
		}
		else
		{
			return("D");
		}
	}
	else if (numGrade <80)
	{
		if(numGrade == 79)
		{
			return("C+");
		}
		else
		{
			return("C");
		}
	}

	else if (numGrade <90)
	{
		if(numGrade == 89)
		{
			return("b+");
		}
		else
		{
			return("b");
		}
	}
		else if (numGrade <100)
		{
			return("A");
		}
		else
		{
				return("A+");
		}


}//closes getLetter

		public static void main(String[] args) 
	{
		final int FLAG = -1;
		final int minValue = 0;
		final int maxValue = 100;
		
		int numericGrade;
		String letterGrade;
		
		//prepare for input
		Scanner input = new Scanner(System.in);
		
		//Get user input
		System.out.println("Eneter a numeric grade (-1 to quit):v ");
		
		//record user input in muericGrade
		numericGrade = input.nextInt();
		
		while(numericGrade != FLAG)
		{
			if(isValidNumber(numericGrade, minValue, maxValue))
			{
				letterGrade = getLetterGrade(numericGrade);
				System.out.println("The grade " 
									+ numericGrade
									+ "is a (n) "
									+ letterGrade
									+ "."
						 			);
			}
			else
			{
				System.out.println("Grade entered is not valid.");
			}
			System.out.println("Eneter numeric grade (-1 to quit): ");
			
			//record user input in numericGrade
			numericGrade = input.nextInt();
			}
		System.out.println("Thank you have a good day! ");
		

	}
	
}//closes the class
