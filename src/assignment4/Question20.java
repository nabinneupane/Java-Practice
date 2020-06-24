package assignment4;

import java.util.Scanner; 


public class Question20 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nFOUR Function Calculator\n");
		
		
		System.out.print("Enter first number: ");
		int a = input.nextInt(); 
		
		System.out.print("Enter second number: "); 
		int b = input.nextInt(); 
		
		
		System.out.print("Enter an operator (+, *, -, /): ");
		char operator = input.next().charAt(0); 
		
		double total = 0; 
		
		switch(operator) {
		
		case '+' : 
			System.out.println("The given operator is for Addition. " + operator);
			System.out.println("\n===============================================\n");
			total =  a+b; 
			break;
		case '-' : 
			System.out.println("The given operator is for Subtraction " + operator);
			System.out.println("\n===============================================\n");
			total =  a-b; 
			break;
			
		case '*' : 
			System.out.println("The given operator is for Multiplication " + operator);
			System.out.println("\n===============================================\n");
			total =  a*b;
			break;
		case '/' : 
			System.out.println("The given operator is for division " + operator);
			System.out.println("\n===============================================\n");
			total = a /(b*1.0);
			break;
		default: 
			System.out.println("The given operator didnt match the four basic operators. ");
		}
		
		System.out.println("\nThe output is: " +  a + " " +operator + " " + b +" = " + total);
		System.out.println("\n===============================================\n");

	}
}
