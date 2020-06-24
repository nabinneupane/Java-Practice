package assignment4;

import java.util.Scanner; 

public class Question17 {

	
	public static void main(String[] args)
	{
		
		System.out.println("\nProgram to calculate leap year\n");
		
		System.out.print("\n Please enter the year: ");
		
		Scanner input = new Scanner(System.in); 
		
		int year = input.nextInt(); 
		
		if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0))
			System.out.println(" The given year is Leap Year");
		
		else 
			System.out.println("\n\nThe given year is not a leap year\n");
		
		input.close();
	}
}
