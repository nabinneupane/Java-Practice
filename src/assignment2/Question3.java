package assignment2;

import java.util.Scanner; 

public class Question3 {
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		
		
		System.out.println("Program to find sum and average of two number. ");
		
		System.out.println("\n=============================================\n");
		
		
		System.out.print("\n Enter first number: "); 
		int a = input.nextInt();
		
		System.out.print("\n Enter second number: ");
		int b = input.nextInt(); 
		
		int sum = a+b; 
		float average = (float) sum/2; 
		
		System.out.println("\n=============================================\n");
		
		System.out.println("\n The sum of given two numbers is: " + sum );
		System.out.println("\n The average of given two numbers is: " + average);
		
		input.close();

	}

}