
package SkillBuilders;

import java.util.Scanner;

public class GradeAvg2of2 {

	public static void main(String[] args) 
	{ Scanner input = new Scanner(System.in);
	
	int Grade1, Grade2, Grade3, Grade4, Grade5;
	
	int total =0;
	
	System.out.print("Eneter grade 1: ");
	total += input.nextInt();
	
	System.out.print("Eneter grade 2: ");
	total += input.nextInt();
	
	System.out.print("Eneter grade 3: ");
	total += input.nextInt();
	
	System.out.print("Eneter grade 4: ");
	total += input.nextInt();
	
	System.out.print("Eneter grade 5: ");
	total += input.nextInt();
	
	double average = total / 5.0;
	
	System.out.printf("Average: %.2f%%%n",
average);
		
	
	}
	

}

/*Screen Dump
 
 Enter the min number: 
1
Enter the max number: 
10
Random number: 5
 
 
 
 Enter the min number: 
1
Enter the max number: 
10
Random number: 5

 
 
 
 Enter the min number: 
1
Enter the max number: 
10
Random number: 8
 
 */


