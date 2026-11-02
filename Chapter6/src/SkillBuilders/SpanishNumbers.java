package SkillBuilders;

public class SpanishNumbers {

	public static void main(String[] args) 
	{
		for (int number = 1; number <= 10; number++)
		{
			displaySpanish(number);
		}
	}
	
	public static void displaySpanish(int number) {
		
		if (number ==1) {
			System.out.println("1 uno");
		} else if (number ==2) {
			System.out.println("2 dos");
		} else if (number ==3) {
			System.out.println("3 tres");
		} else if (number ==4) {
			System.out.println("4 cuatro");
		} else if (number ==5) {
			System.out.println("5 cinco");
		} else if (number ==6) {
			System.out.println ("6 seis");
		} else if (number ==7) {
			System.out.println ("7 siete");
		} else if (number ==8) {
			System.out.println("8 ocho");
		} else if (number ==9) {
			System.out.println("9 nueve");
		} else if (number ==10) {
			System.out.println("10 diez");
		}
	}
}

