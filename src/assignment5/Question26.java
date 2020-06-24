package assignment5;

import java.util.Scanner;

public class Question26 {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the number to be reversed: ");
		
		int number = sc.nextInt(); 
		
		System.out.println("\nThe number entered is: " + number);
		int reverse =0; 
		while (number != 0)
		{
			//System.out.println("Hi");
			int divisible = number % 10; 
			
			number /= 10; 
			reverse = reverse * 10 + divisible;
			
		}
		
		System.out.println("\nReversed number is: " + reverse);
	}
	
	
}
