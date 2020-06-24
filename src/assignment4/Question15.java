package assignment4;

import java.util.Scanner; 
public class Question15 {

	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nProgram that receives an ASCII code and display its character***** \n");
		while(true)
		{
			System.out.print("Please enter any number between 0-128: ");
			
			int value = input.nextInt(); 
			if (value >= 0 && value <= 128)
			{
				System.out.println("\nThe ASCII code for the given number is : " + ((char) value));
				break;
			}
			else 
				continue;
		}
	}
}
