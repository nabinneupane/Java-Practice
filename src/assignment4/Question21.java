package assignment4;


import java.util.Scanner; 

public class Question21 {

	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in); 
		
		while(true)
		{
			System.out.print("Enter the number between 1-7: ");
			
			int number = input.nextInt(); 
			System.out.println("\n===============================================\n");
			if (number > 0 && number <= 7)
			{
				switch(number) {
				case 1: 
					System.out.println("Today is Sunday.");
					break;
				case 2: 
					System.out.println("Today is Moday.");
					break;
				case 3: 
					System.out.println("Today is Tuesday.");
					break;
				case 4: 
					System.out.println("Today is Wednesday.");
					break;
				case 5: 
					System.out.println("Today is Thursday.");
					break;
				case 6: 
					System.out.println("Today is Friday.");
					break;
				case 7: 
					System.out.println("Today is Saturday.");
					break;
				}
				break; 
			}
			else 
				continue; 
		}
		
		
		
/*		//USING ARRAY LIST 
		String[] arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		
		
		while (true)
		{
		
			System.out.print("Enter the number between 1-7: ");
			
			int number = input.nextInt(); 
			
			if (number > 0 && number <= 7)
			{
				System.out.println("\n===============================================\n");
				System.out.println("Today is " + arr[number-1]);
				break;
			}
		
		} */
	}
}

