package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) 
	{ Scanner input = new Scanner(System.in);

    System.out.print("Enter hurricane category 1-5: ");
    int category = input.nextInt();

    switch (category) {
        case 1:
            System.out.println("Category 1: 74-95 mph, 64-82 kts, 119-153 km/hr");
            break;
        case 2:
            System.out.println("Category 2: 96-110 mph, 83-95 kts, 154-177 km/hr");
            break;
        case 3:
            System.out.println("Category 3: 111-130 mph, 96-113 kts, 178-209 km/hr");
            break;
        case 4:
            System.out.println("Category 4: 131-155 mph, 114-135 kts, 210-249 km/hr");
            break;
        case 5:
            System.out.println("Category 5: Higher than 155 mph, higher than 135 kts, higher "
            		+ "than 249 km/hr");
            break;
    }

		

	}

}
