package assignment5;

import java.util.Scanner;

public class Question24 {

	
	public static void main(String[] args)
	{
		System.out.println("\nPrint the factorial of number\n");
		int total=1; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		sc.close();
		
		/*
		if (number > 0 && number < 2)
			total = 1; 
		else 
		{
			for (int i=1; i<= number; i++)
			{
				total *= i; 
			}
		}
		
		System.out.println("\n\n" + number + "! = " + total );
		
		 */
		
		int fact = factorial(number);
		
		System.out.println("\n\n" + number + "! = " + fact );
	}
	
	
	public static int factorial(int i)
	{
		if (i >0 && i < 2)
			return 1; 
		else 
			
			return i* factorial(i-1); 
	}
}

