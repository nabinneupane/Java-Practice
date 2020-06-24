package assignment6;

import java.util.Scanner;

public class Question28 {

	
	
	public boolean isPrimeNumber(int a)
	{
		
		if (a >0 && a <=2)
			return true; 
		if(a == 0)
			return false;
		
		for (int i=2; i< a/2; i++)
		{
			if (a%i == 0)
				return false; 
			
		}
		
		return true; 
	}
	
	
	public void firstNthPrime(int a)
	{
		for (int i=1; i< a; i++)
		{
			if(isPrimeNumber(i))
				System.out.print(i + " ");
			
		}
	}
	
	public void allPrimeBetween(int a, int b) {
		
		for (int i=a; i<b; i++)
		{
			if(isPrimeNumber(i))
				System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		Question28 obj = new Question28(); 
		
		System.out.println("To check either the given number is prime or not");
		System.out.print("\nEnter the number: ");
		int number = sc.nextInt();
		
		//Function call 
		boolean check = obj.isPrimeNumber(number);
		
		String print = (check) ? "\nGiven number is PRIME": "\ngiven number is NOT PRIME"; 
		
		System.out.println(print);
		
		System.out.println("\n=========================================================\n");
		
		
		System.out.println("To print first nth prime numbers");
		
		System.out.print("\nEnter the number: ");
		int num =sc.nextInt(); 
		
		System.out.println("\nThe Prime numbers upto " + num + " are: \n");
		obj.firstNthPrime(num);
		
		System.out.println("\n=========================================================\n");
		
		
		
		System.out.println("To Print all prime between given two numbers");
		
		System.out.print("\nEnter first number: ");
		int first = sc.nextInt();
		
		System.out.print("\nEnter second number: ");
		int second = sc.nextInt(); 
		
		System.out.println("\nPrime number between " + first + " and "+ second + " are: \n");
		obj.allPrimeBetween(first, second);
		
		System.out.println("\n=========================================================\n");
		
		sc.close();
		
	}
	

}
