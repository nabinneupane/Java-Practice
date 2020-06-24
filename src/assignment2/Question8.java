package assignment2;


import java.util.Scanner;


public class Question8 {
	
	 
	
	public static void main(String[] args)
	{
		
		System.out.println("Program to change Celcius to Fahrenheit and fahrenheit to celcius ");
		
		System.out.println("\n=============================================\n");
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("\n Enter temperature in celcuis: ");
		double c = input.nextInt(); 
		
		System.out.print("\n Enter temperature in Fahrenheit: ");
		double f = input.nextInt(); 
		
		System.out.println("\n====================================");
		
		celciusToFahrenheit(c); 
		fahrenheitToCelcius(f);
		
		
		
	}

	static void celciusToFahrenheit(double c ) {
		
		double calculation =  ((c * (9.0/5.0)) + 53); 
		
		System.out.println( " \n " + c + " degree Celcuis is equals to " + calculation + " degree Fahrenheit");
		
	}
	
	static void fahrenheitToCelcius(double f) 
	{
		
		double calculation =  ( (f - 32) * (5.0/9.0));
		
		
		System.out.println( " \n " + f + " degree Fahrenheit is equals to " + calculation + " degree Celcius");
	}
}
