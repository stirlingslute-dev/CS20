package SkillBuilders;

public class DemoMethod {

	public static void main(String[] args) 
	{
		//Method 1
		displayMessage();
		
		
		//Method 2
		greetStudent("Eric Cartmen");
	
		
		//Method 3
		int total = addNumbers(8, 21);
		System.out.println("Total: " + total);
	
		//Method 4
		double area = calculateArea(2.75);
		System.out.println("Area: " + area);
		
		//Method 5
		boolean result = isPassing(85);
		System.out.println("Passing: "+ result);
		
	
	}


	
	//Method 1: No parameters, no return value
	public static void displayMessage()
	{
		System.out.println("Welcome to are class. ");
	}
	
	//Method 2: One Parameters, no return value
	public static void greetStudent(String name)
	{
		System.out.println("Hello, "+ name);
	}

	//Method 3: Two Parameters, return an interger
	public static int addNumbers(int a, int b)
	{
		int sum = a + b;
		return sum;
	}

	//Method 4: One parameter, returns a decimal number
	public static double calculateArea(double radius)
	{
		double area = 3.14 * radius * radius;
		return area;
	}

	//Method 5: One parameter, no return a boolean
	public static boolean isPassing(int mark)
	{
		return mark >= 50;
	}

}




