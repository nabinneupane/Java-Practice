package assignment4;

import java.util.Scanner; 
public class Question19 {

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		
		
		System.out.println("Program that accepts three side of triangle to display which triangle is formed.\n");
		
		System.out.print("\nEnter the first side of triangle: ");
		int a = input.nextInt(); 
		
		System.out.print("\nEnter the second side of triangle: ");
		int b = input.nextInt();
		
		System.out.print("\nEnter the third side of triangle: ");
		int c = input.nextInt(); 
		
		
		if ((a==b) && (b==c))
			System.out.println("The given triangle is Equilateral Triangle. ");
		else if ((a>= (b+c)) || (c>= (b+a)) || (b>= (a+c)))
			System.out.println("Not a valid triangle");
		else if ((a==b) || (b==c) || (a==c))
			System.out.println("The given triangle is Isosceles Triangle. ");
		else 
			System.out.println("The given triangle is Scalene Triangle");
		
		
		
	}
}
