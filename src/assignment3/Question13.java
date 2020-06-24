package assignment3;

import java.util.Scanner; 

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter a number: ");
			int a = input.nextInt(); 
			
			if (a < 0)
			{
				System.out.println("\n========================");
				System.out.println("\nYou entered: " + a);
				System.out.println("\n========================");
				break;
			}
			else 
				continue;
		}
		
	}

}
